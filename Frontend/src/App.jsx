import { useState } from 'react';
import reactLogo from './assets/react.svg';
import viteLogo from '/vite.svg';
import './App.css';
import Login from './pages/Login';
import AuthService from './services/auth.serviece';
import Logout from './pages/Logout';
import Register from './pages/Register';
import Game from './pages/Game';
import Menu from './pages/Menu';
import { BrowserRouter as Router, Route, Routes, Navigate } from "react-router-dom";
import Highscore from './pages/Highscore';
import img from './assets/DontDropTheBlop.png';

function App() {
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [showLogin, setShowLogin] = useState(true);

  const handleShowLogin = () => {
    setShowLogin(true);
  };

  const handleShowRegister = () => {
    setShowLogin(false);
  };

  const handleLogin = () => {
    // Hier könnte z.B. die Authentifizierungslogik von AuthService aufgerufen werden
    setIsAuthenticated(true);
  };

  const handleLogout = () => {
    setIsAuthenticated(false);
  };

  return (
    <Router>
      <div className="image-container">
        <img src={img} alt="Dont Drop The Blop" className="logo-image" />
        <div>
          {!isAuthenticated ? (
            <div id="authContainer">
              <div id="buttonContainer">
                <button onClick={handleShowLogin} className={showLogin ? "active" : ""}>
                  Anmelden
                </button>
                <button onClick={handleShowRegister} className={!showLogin ? "active" : ""}>
                  Registrieren
                </button>
              </div>
              {showLogin ? (
                <div id="loginForm">
                  <Login />
                </div>
              ) : (
                <div id="registerForm">
                  <Register />
                </div>
              )}
            </div>
          ) : (
            <Routes>
              {/* Automatische Weiterleitung zum Menü, wenn eingeloggt */}
              <Route path="/" element={<Navigate to="/menu" />} />
              <Route path="/menu" element={<Menu onLogout={handleLogout} />} />
              <Route path="/game" element={<Game />} />
              <Route path="/highscore" element={<Highscore />} />
            </Routes>
          )}
        </div>
      </div>
    </Router>
  );
}

export default App;
