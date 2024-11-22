import AuthService from "../services/auth.serviece";
import { useState } from 'react';

function Register() {
  const [entries, setEntries] = useState({});
  const store = (e) => {
    setEntries({
      ...entries,
      [e.target.name]: e.target.value
    });
  };
  
  const handleSubmit = (event) => {
    event.preventDefault();
    AuthService.register(entries.username, entries.email, entries.password)
      .then((response) => {
        console.log("User registered:", response.data);
      })
      .catch((error) => {
        console.error("There was an error registering the user!", error);
      });
  };

  return (
    <div className="register-container">
      <form onSubmit={handleSubmit}>
        <h2>Registrieren</h2>
        <div className="form-group">
          <label htmlFor="username">Username:</label>
          <input
            type="text"
            id="username"
            name="username"
            value={entries.username || ''}
            onChange={store}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            name="password"
            value={entries.password || ''}
            onChange={store}
            required
          />
        </div>
        <button type="submit">Registrieren</button>
      </form>
    </div>
   
  );
}

export default Register;
