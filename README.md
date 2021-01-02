# Spring Boot, Travis CI, and Azure Playground

This project is a playground to learn more about building a Spring Boot project using Travic CI, and running it in Azure.

## Build

Build using Maven wrapper: `./mvnw package`

## Run

Run with: `mvn spring-boot:run`

## Use application

The application is very simple.
It has a REST endpoint that returns the current time on ISO 8601 format:
`curl http://localhost:8080/now`
