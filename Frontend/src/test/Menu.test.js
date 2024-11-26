import { render, screen, fireEvent } from '@testing-library/react';
import Menu from './pages/Menu';
import { BrowserRouter } from 'react-router-dom';

test('renders game and highscore buttons', () => {
  render(
    <BrowserRouter>
      <Menu onLogout={() => {}} />
    </BrowserRouter>
  );

  // Prüfen, ob die Schaltflächen "Spiel starten" und "Highscore" angezeigt werden
  expect(screen.getByText('Spiel starten')).toBeInTheDocument();
  expect(screen.getByText('Highscore')).toBeInTheDocument();
});

test('calls onLogout function when logout button is clicked', () => {
  const mockLogout = jest.fn();
  render(
    <BrowserRouter>
      <Menu onLogout={mockLogout} />
    </BrowserRouter>
  );

  // Logout-Schaltfläche klicken
  fireEvent.click(screen.getByText('Logout'));

  // Prüfen, ob die onLogout-Funktion aufgerufen wurde
  expect(mockLogout).toHaveBeenCalledTimes(1);
});
