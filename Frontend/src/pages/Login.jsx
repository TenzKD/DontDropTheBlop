import AuthService from "../services/auth.serviece";
import { useState } from 'react'
import img from '../assets/DontDropTheBlop.png';

function Login() {
  const [entries, setEntries] = useState({});
  const store = (e) => {
    setEntries({
      ...entries,
      [e.target.name]: e.target.value
    });
  }
  const handleSubmit = (event) => {
    event.preventDefault();
    const result = AuthService.login(entries.username, entries.password);
    console.log(result);
  };

  return (

    <div className="login-container">
      <form onSubmit={handleSubmit}>
        <h2>Login</h2>
        <div className="form-group">
          <label htmlFor="username">Username:</label>
          <input type="text" id="username"
            name="username" value={entries.username}
            onChange={store}
            required
          />
        </div>
        
        <div className="form-group">
          <label htmlFor="password">Password:</label>
          <input type="password" id="password"
            name="password" value={entries.password}
            onChange={store}
            required
          />
        </div>
        <button type="submit" >Login</button>
      </form>
    </div>

  );
}

export default Login;