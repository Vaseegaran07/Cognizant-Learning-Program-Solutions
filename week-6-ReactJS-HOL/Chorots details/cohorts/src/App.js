import React from 'react';
import Posts from './Post';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div className="App">
      <h1>My Academy Dashboard</h1>
      <CohortDetails name="React Bootcamp" status="ongoing" startDate="2025-06-15" />
      <CohortDetails name="Java Spring Cohort" status="completed" startDate="2025-05-10" />
    </div>
  );
}

export default App;
