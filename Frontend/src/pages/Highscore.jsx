import { Link } from 'react-router-dom';
import '../App.css';
import img from '../assets/DontDropTheBlop.png';

function Highscore() {
  return (
    
    <div className="container">
      <div className="auth-container">
        <h1>Highscore</h1>
        <p>Es gibt derzeit keine Highscores.</p>
        <Link to="/menu">
          <button className="button">Home</button>
        </Link>
      </div>
    </div>
    
  );
}

export default Highscore;
