import { useEffect } from 'react';
import { Link } from 'react-router-dom';
import initializeGame from '../script.js';

export default function Game() {
  useEffect(() => {
    initializeGame();
  }, []); 

  return (
    <div className="game-container">
      <canvas id="gameCanvas" width="400" height="600"></canvas>
      <div id="score">Score: 0</div>
      <button id="startButton">Start</button>
      <button id="resetButton" style={{ display: "none" }}>Reset</button>
      <Link to="/menu">
        <button className="button">Menü</button>
      </Link>
    </div>
  );
}
