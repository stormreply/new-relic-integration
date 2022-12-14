# Frontend

This folder has the source code for running the app's frontend.

![Frontend](assets/asset-1.png)

---

## Contents

- [Frontend](#frontend)
  - [Contents](#contents)
  - [New Relic APM Integration](#new-relic-apm-integration)
  - [Running the Code](#running-the-code)
  - [New Relic Dashboard](#new-relic-dashboard)

---

## New Relic APM Integration

1. Go to New Relic Dashboard > Add data. Then go to Browser & Mobile, select React.
2. For the deployment method choose Copy/Paste Javascript code and then type your application name.
3. Copy the Javascript and integrate into react `index.html`

## Running the Code

1. Install Dependencies

```sh
# NPM:
npm install

# YARN:
yarn install
```

3. We can now build and run the application by issuing the following command:

```sh
# NPM:
npm run dev

# YARN:
yarn dev
```

4. Frontend available at `localhost:3000`

## New Relic Dashboard

![Screenshot 2](assets/asset-2.png)
![Screenshot 3](assets/asset-3.png)
![Screenshot 4](assets/asset-4.png)
