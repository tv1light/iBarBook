import React from 'react';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import Cocktails from './pages/Cocktails';
import CocktailDetail from './pages/CocktailDetail';
import Ingredients from './pages/Ingredients';
import Tools from './pages/Tools';
import './styles.css';
import IngredientDetail from "./pages/IngredientDetail";
import ToolDetail from "./pages/ToolDetail";


const App: React.FC = () => {
  return (
      <Router>
        <div className="container">
          <Header />
          <main className="main-content">
            <Sidebar />
            <Routes>
              <Route path="/cocktails" Component={Cocktails}/>
                <Route path="/cocktails/:id" Component={CocktailDetail} />
              <Route path="/ingredients" Component={Ingredients}/>
                <Route path="/ingredients/:id" Component={IngredientDetail}/>
              <Route path="/tools" Component={Tools}/>
              <Route path="/tools/:id" Component={ToolDetail}/>
            </Routes>
          </main>
        </div>
      </Router>
  );
};

export default App;
