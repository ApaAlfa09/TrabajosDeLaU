import { BrowserRouter } from "react-router-dom";
import "./App.css";
import { AppRoutes } from "./routes/AppRoutes";


function App() {
  return (
    <BrowserRouter>
      <div className="app">
        <main>
          <AppRoutes />
        </main>
      </div>
    </BrowserRouter>
  );
}

export default App;
