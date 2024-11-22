import { useState } from 'react';
import AuthService from '../services/auth.serviece';

function Login({ onLoginSuccess }) {
  const [entries, setEntries] = useState({});

  const store = (e) => {
    setEntries({
      ...entries,
      [e.target.name]: e.target.value
    });
  }

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const result = await AuthService.login(entries.username, entries.password);
      if (result && result.token) {
        console.log('Login erfolgreich:', result);
        onLoginSuccess(); 
      }
    } catch (error) {
      console.error('Fehler beim Login:', error);
    }
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <h2>Login</h2>
        <div className="form-group">
          <label htmlFor="username">Username:</label>
          <input type="text" id="username"
            name="username" value={entries.username || ""}
            onChange={store}
            required
          />
        </div>
        
        <div className="form-group">
          <label htmlFor="password">Password:</label>
          <input type="password" id="password"
            name="password" value={entries.password || ""}
            onChange={store}
            required
          />
        </div>
        <button type="submit">Login</button>
      </form>
    </div>
  );
}

export default Login;
