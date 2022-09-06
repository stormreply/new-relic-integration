# New Relic Integration

This project aims to show the integration of New Relic monitoring into a whole application. For testing we implemented a simple Employees Management.

---

## Contents

- [New Relic Integration](#new-relic-integration)
  - [Contents](#contents)
  - [Architecture](#architecture)
  - [Source code structure](#source-code-structure)
  - [Prerequisites](#prerequisites)
  - [New Relic Integration](#new-relic-integration-1)
  - [Running Code](#running-code)

---

## Architecture

This application is formed of:

- Database: MariaDB was used
- Backend: A Spring Boot Backend written in Java
- Frontend: A Server-Side-Rendering React running on top of Express written in Typescript

## Source code structure

Table below explains how this source ode structured:

| File / Folder | Description                                        |
| ------------- | -------------------------------------------------- |
| backend       | This folder contains the source code for frontend. |
| frontend      | This folder contains the source code for frontend. |

Refer to the folders for an extended structure

## Prerequisites

This section has various steps needed to perform before deploying on AWS.

- **New Relic account**: a New Relic account was used for the testing.
- **Java JDK**: a Java JDK installation is needed.
- **Node.JS**: a Node.JS installation is needed.

## New Relic Integration

- Backend: We are going to integrate Java APM into Spring Boot using Maven
- Frontend: Since we aren't using React SSR (Server Side Rendering) we will integrate Browser Monitoring for React. For any NodeJS framework that is running as SSR, it is possible to integrate NodeJs APM.

## Running Code

1. See how to run the backend in `backend` readme file.
2. See how to run the frontend in `frontend` readme file.
