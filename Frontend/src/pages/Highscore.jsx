import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';
import '../App.css';
import img from '../assets/DontDropTheBlop.png';

function Highscore() {
  const [players, setPlayers] = useState([]);

  useEffect(() => {
    const fetchHighscores = async () => {
      try {
        const response = await axios.get('http://localhost:8080/api/scores/top10');
        setPlayers(response.data);
      } catch (error) {
        console.error('Fehler beim Abrufen der Highscores:', error);
      }
    };
  
    fetchHighscores();
  }, []);
  

  return (
    <div className="container">
      <div className="auth-container">
        <h1>Highscore</h1>
        <table className="highscore-table">
          <thead>
            <tr>
              <th>#</th>
              <th>Username</th>
              <th>Score</th>
            </tr>
          </thead>
          <tbody>
            {players.length > 0 ? (
              players.map((player, index) => (
                <tr key={index}>
                  <td>{index + 1}</td>
                  <td>{player.username}</td>
                  <td>{player.score}</td>
                </tr>
              ))
            ) : (
              <tr>
                <td colSpan="3">Es gibt derzeit keine Highscores.</td>
              </tr>
            )}
          </tbody>
        </table>
        <Link to="/menu">
          <button className="button">Home</button>
        </Link>
      </div>
    </div>
  );
}

export default Highscore;
