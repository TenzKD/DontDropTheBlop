import { Link } from "react-router-dom";
import '../App.css';
import img from '../assets/DontDropTheBlop.png';


function Menu({ onLogout }) {
  return (

    <div className="container">
      <div className="auth-container">

        <h2>Menü</h2>
        {/* Navigation Buttons */}
        <Link to="/game">
          <button className="button">Spiel starten</button>
        </Link>
        <Link to="/highscore">
          <button className="button">Highscore</button>
        </Link>
        <button className="button" onClick={onLogout}>Logout</button>
      </div>
    </div>

  );
}

export default Menu;