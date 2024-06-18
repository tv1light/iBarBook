import React from 'react';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import Cocktails from './pages/Cocktails';
import Ingredients from './pages/Ingredients';
import Tools from './pages/Tools';
import './styles.css';

const App: React.FC = () => {
  return (
      <Router>
        <div className="container">
          <Header />
          <main className="main-content">
            <Sidebar />
            <Routes>
              <Route path="/cocktails" Component={Cocktails}/>
              <Route path="/ingredients" Component={Ingredients}/>
              <Route path="/tools" Component={Tools}/>
            </Routes>
          </main>
        </div>
      </Router>
  );
};

export default App;
