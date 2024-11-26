import { render, screen } from '@testing-library/react';
import App from './App';
import { BrowserRouter } from 'react-router-dom';

test('renders login and register buttons when not authenticated', () => {
  render(
    <BrowserRouter>
      <App />
    </BrowserRouter>
  );

  // Prüfen, ob die Schaltflächen "Anmelden" und "Registrieren" angezeigt werden
  expect(screen.getByText('Anmelden')).toBeInTheDocument();
  expect(screen.getByText('Registrieren')).toBeInTheDocument();
});
