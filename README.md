# TSM Applicant Test

A full stack template application test to be completed by potential full-stack developers.

## Test Brief

Create a full stack application for users to list and sort a range of mobile products, consisting of separate backend and frontend applications. The products can be of varying types with varying attributes. The application should be able to display products by price order ascending or descending, or grouped by type with price ordering within each group.
Some template code has been provided to get you started. Please feel free to use any 3rd party dependencies you see fit to accomplish the task

## Frontend

The frontend application is located in the `frontend` directory and has been created with [Vue CLI](https://cli.vuejs.org/) using [Node](https://nodejs.org/en/) version 8. The frontend application contains a `package.json` file containing all project dependencies and scripts to build and run the frontend application. The frontend application should retrieve and display a list of products from the backend and give the user ability to sort and group the products.

## Backend

The backend application is located in the `backend` directory and consists of a [Dropwizard](https://www.dropwizard.io/1.3.5/docs/) base template with a [gradle](https://gradle.org/) development environment. You should implement an endpoint as a restful interface to provide functionality to the frontend application to retrieve and sort the products. A `products.json` file has been provided in the `src/main/resources` directory.

## Deployment

Both applications should be built using their provided build frameworks and deployable as docker containers. Tasks should be created in both build environment to create and configure the docker images. The frontend and backend applications should be available on ports 9000 and 4000 respectively within the docker image.  

## Delivery

Please submit your completed test as a zip file containing both applications excluding build dependencies. Please also include a short (a few paragraphs only) document about how you approached the challenge, any assumptions you made, any problems you had and your reasoning for choosing libraries or frameworks that had particular significance to your solution.

## FAQ/Guidelines

Q. How long should I spend on the task?  
A. Its really up to you, but we're sure you've got busy lives with plenty of commitments already, so we've tried to limit the task to something that could be achieved over a weekend or a few evenings

Q. I'm not familiar with one or more of the tools/languages/frameworks in the template, do I have to use them?  
A. We've used the tools in this template because they represent a large portion of what we use in our real stack at TSM. If you are unfamiliar with any of them we would first recommend a bit of research on how to use them, but ultimately if you wish to complete the task using something you're already comfortable with and it works thats fine, just be sure to write up any reasoning to include with your submission

Q. What if I get stuck?
A. There are a lot of parts and things to consider here, so if an aspect is being troublesome don't dwell on it for too long. We'll still consider your submission even if you've had to skip over a step here or there. Again add any comments if this is the case to your submission, explaining your thoughts and understanding where you may need to develop is something we put a lot of value on

Q. Are there any particular techniques, approaches, or other things you're looking for?  
A. Beyond the obvious of completing the brief,  We're interested in how you approach the problem, and what kind of non-functional things you consider. So the accompanying documentation we've asked you to provide carries quite a lot of weight.