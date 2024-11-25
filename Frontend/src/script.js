import AuthService from './services/auth.serviece';
import axios from 'axios';
import playerImageSrc from './assets/Blooby.png';




function gameOver() {
  gameRunning = false;
  resetButton.style.display = "inline-block";

  const currentUser = AuthService.getCurrentUser();
  if (currentUser && currentUser.username) {
    const savedScore = currentUser.score || 0;
    if (score > savedScore) {
      // Hole den JWT-Token des Benutzers
      const token = currentUser.token;  // Stelle sicher, dass `token` im `currentUser`-Objekt gespeichert ist

      axios.post('http://localhost:8080/api/auth/saveScore', {
          username: currentUser.username,
          score: score
        }, {
          headers: {
            'Authorization': `Bearer ${token}`,  // Füge den JWT-Token zum Header hinzu
            'Content-Type': 'application/json'
          }
        })
        .then((response) => {
          console.log("Score erfolgreich gespeichert");
          // Aktualisiere den gespeicherten Score im lokalen Speicher
          currentUser.score = score;
          localStorage.setItem("user", JSON.stringify(currentUser));
        })
        .catch((error) => {
          console.error("Fehler beim Speichern des Scores", error);
        });
    } else {
      console.log("Aktueller Score ist nicht höher als der gespeicherte Score, kein Update erforderlich");
    }
  }
}

export default function initializeGame() {
  const canvas = document.getElementById("gameCanvas");
  const ctx = canvas.getContext("2d");
  const startButton = document.getElementById("startButton");
  const resetButton = document.getElementById("resetButton");
  const scoreElement = document.getElementById("score");

  let gameRunning = false;
  let score = 0;
  let platformSpeed = 1;
  let lastFrameTime = 0;
  const fpsInterval = 1000 / 120;

  const player = {
    x: 200,
    y: 500,
    width: 30,
    height: 30,
    dy: 0,
    jumpPower: -10,
    gravity: 0.3,
    speed: 0,
  };

  const platforms = [];
  const platformCount = 6;
  const platformWidth = 60;
  const platformHeight = 10;

  function createPlatforms() {
    platforms.length = 0;
    for (let i = 0; i < platformCount; i++) {
      const x = Math.random() * (canvas.width - platformWidth);
      const y = i * (canvas.height / platformCount);
      platforms.push({ x, y, width: platformWidth, height: platformHeight, touched: false });
    }
    player.y = platforms[0].y - player.height;
    player.x = platforms[0].x + (platformWidth / 2) - (player.width / 2);
  }





// Spieler-Bild erstellen und Quelle setzen
const playerImage = new Image();
playerImage.src = playerImageSrc;

// Verwende ein Flag, um zu überprüfen, ob das Bild geladen wurde
let playerImageLoaded = false;

playerImage.onload = function () {
  playerImageLoaded = true;
  console.log("Player Image erfolgreich geladen");
};

playerImage.onerror = function () {
  console.error("Fehler beim Laden des Player-Images. Überprüfe den Pfad:", playerImage.src);
};

function drawPlayer() {
  if (playerImageLoaded) {
    ctx.drawImage(playerImage, player.x, player.y, player.width, player.height);
  } else {
    ctx.fillStyle = "#FF6347";
    ctx.fillRect(player.x, player.y, player.width, player.height);
  }
}

  function drawPlatforms() {
    ctx.fillStyle = "#228B22";
    platforms.forEach(platform => {
      ctx.fillRect(platform.x, platform.y, platform.width, platform.height);
    });
  }

  function updatePlayer() {
    player.y += player.dy;
    player.dy += player.gravity;
    player.x += player.speed;

    if (player.x < 0) player.x = 0;
    if (player.x + player.width > canvas.width) player.x = canvas.width - player.width;

    if (player.y + player.height > canvas.height) {
      gameOver();
    }

    platforms.forEach(platform => {
      if (
        player.y + player.height >= platform.y &&
        player.y + player.height <= platform.y + platform.height &&
        player.x + player.width > platform.x &&
        player.x < platform.x + platform.width &&
        player.dy >= 0
      ) {
        if (!platform.touched) {
          platform.touched = true;
          score++;
          scoreElement.innerText = `Score: ${score}`;
          if (score % 50 === 0) {
            platformSpeed += 0.5;
          }
        }
        player.dy = player.jumpPower;
        player.y = platform.y - player.height;
      }
    });
  }

  function updatePlatforms() {
    platforms.forEach(platform => {
      platform.y += platformSpeed;
      if (platform.y > canvas.height) {
        platform.y = 0;
        platform.x = Math.random() * (canvas.width - platformWidth);
        platform.touched = false;
      }
    });
  }

  function gameLoop(timestamp) {
    if (!gameRunning) return;
    const elapsed = timestamp - lastFrameTime;
    if (elapsed > fpsInterval) {
      lastFrameTime = timestamp - (elapsed % fpsInterval);
      ctx.clearRect(0, 0, canvas.width, canvas.height);
      drawPlatforms();
      drawPlayer();
      updatePlayer();
      updatePlatforms();
    }
    requestAnimationFrame(gameLoop);
  }

  function startGame() {
    gameRunning = true;
    score = 0;
    platformSpeed = 1;
    scoreElement.innerText = `Score: ${score}`;
    createPlatforms();
    player.dy = player.jumpPower;
    startButton.style.display = "none";
    resetButton.style.display = "inline-block";
    lastFrameTime = performance.now();
    requestAnimationFrame(gameLoop);
  }

  function resetGame() {
    gameRunning = false;
    player.speed = 0;
    score = 0;
    platformSpeed = 1;
    scoreElement.innerText = `Score: ${score}`;
    createPlatforms();
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    drawPlatforms();
    drawPlayer();
    startButton.style.display = "inline-block";
    resetButton.style.display = "none";
  }

  if (startButton && resetButton) {
    startButton.addEventListener("click", startGame);
    resetButton.addEventListener("click", resetGame);
  }

  document.addEventListener("keydown", e => {
    if (e.key === "ArrowLeft") {
      player.speed = -4;
    }
    if (e.key === "ArrowRight") {
      player.speed = 4;
    }
  });

  document.addEventListener("keyup", e => {
    if (e.key === "ArrowLeft" || e.key === "ArrowRight") {
      player.speed = 0;
    }
  });
}