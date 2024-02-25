import logo from './logo.svg';
import './App.css';
import Appbar from './components/AppBar';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom'; 

function App() {
  return (
    
    <BrowserRouter>
    <Appbar/>
    <h1> This is main content</h1>
    </BrowserRouter>
  );
  
}
export default App;