import React from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import ListEmployee from "./components/ListEmployee";
import CreateEmployee from "./components/CreateEmployee";
import UpdateEmployee from "./components/UpdateEmployee";
import ViewEmployee from "./components/ViewEmployee";

function App() {
  return (
    <Router>
      <div className="container">
        <Switch>
          <Route path="/" exact component={ListEmployee} />
          <Route path="/employees/:id/update" component={UpdateEmployee} />
          <Route path="/employees/add" component={CreateEmployee} />
          <Route path="/employees/:id" component={ViewEmployee} />
          <Route path="/employees" component={ListEmployee} />
        </Switch>
      </div>
    </Router>
  );
}

export default App;
