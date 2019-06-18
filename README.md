# Applicant Test

A full stack template application test to be completed by potential full-stack developers.

## Test

Create a full stack application consisting of separate backend and frontend applications that will allow users to list and sort a range of mobile products. The products can be of varying types and have varying attributes. The frontend application should be able to output the products by price order ascending or descending or grouped by type, with price ordering within each group. Both applications should be developed using the provided Dropwizard and Vue.js templates. Please feel free to use whichever 3rd party dependencies you see fit to accomplish the frontend and backend functionality.

## Frontend

The frontend application is located in the `frontend` directory and has been created with [Vue CLI](https://cli.vuejs.org/) using [Node](https://nodejs.org/en/) version 8. The frontend application contains a `package.json` file containing all project dependencies and scripts to build and run the frontend application. The frontend application should retrieve and display a list of products from the backend and provide sorting functionality.

## Backend

The backend application is located in the `backend` directory and consists of a [Dropwizard](https://www.dropwizard.io/1.3.5/docs/) base template with a [gradle](https://gradle.org/) development environment. You should implement an endpoint as a restful interface to provide functionality to the frontend application to retrieve and sort the products. A `products.json` file has been provided in the `src/main/resources` directory.

## Deployment

Both applications should be built using their provided build frameworks and deployable as docker containers. Tasks should be created in both build environment to create and configure the docker images. The frontend and backend applications should be available on ports 9000 and 4000 respectively within the docker image.  

## Delivery

Please submit your completed test as a zip file containing both applications excluding build dependencies. Please also include a short (a few paragraphs only) document about how you approached the challenge, any assumptions you made, any problems you had and your reasoning for choosing libraries or frameworks that had particular significance to your solution.
