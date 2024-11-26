import { render, screen, fireEvent } from '@testing-library/react';
import Login from './pages/Login';

test('renders login form with username and password fields', () => {
  render(<Login onLoginSuccess={() => {}} />);

  // Prüfen, ob die Felder "Username" und "Password" angezeigt werden
  expect(screen.getByLabelText('Username:')).toBeInTheDocument();
  expect(screen.getByLabelText('Password:')).toBeInTheDocument();
});

test('submits login form successfully', () => {
  const mockLoginSuccess = jest.fn();
  render(<Login onLoginSuccess={mockLoginSuccess} />);

  // Benutzername und Passwort eingeben
  fireEvent.change(screen.getByLabelText('Username:'), { target: { value: 'testuser' } });
  fireEvent.change(screen.getByLabelText('Password:'), { target: { value: 'password123' } });

  // Login-Button klicken
  fireEvent.click(screen.getByRole('button', { name: 'Login' }));

  // Überprüfen, ob die Login-Funktion (onLoginSuccess) aufgerufen wurde
  expect(mockLoginSuccess).toHaveBeenCalledTimes(1);
});
