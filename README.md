# Project - Data Transformer

This application will be kind of Transformer which fetches data from third party service and after transforming
pushes data to internal system for further workflow/analytics etc..

## Project consist of 3 service(s)
1. External third party service
2. Data-Transformer service
3. Statement processor service

### External third party service
    This might be newly acquired system for which integratio is required. Customer actual transactions/Statement is stored in this CRM system
### Data-Transformer service
    Middleware data transformation service
### Statement processor service
    This receives tranformed data and does furhter processing for example send email etc..

## Flow Diagram
![Alt text](./docs/data-transformation-flow.jpg?raw=true "Flow")

## Contract verification
   "spring-cloud-starter-contract-verifier" is used to generated stubs for contract in external-third party and statement processor service
## Contract/stub runner
   "spring-cloud-starter-contract-stub-runner" is used to run mapping on test start.

## Reference Test
   Please refer "TransformationControllerTest" in data-transformer service for basic test with contract runner

## Answer to question 
 ##### What problem does this application try to solve?
       This application is trying to solve a problem where we have difference of contract or may be integration 
       of newly acquired system where we need data in certain format but it is not available

 ##### How to design your application so that it is testable?
       Integration test using contract validation

 ##### If the application must be deployed to a server in remote location, how would you do it?
       By creating a docker image and run on machine which supports docker







