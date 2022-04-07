# SpringBoot-Test-Finale-Application

Questo è un applicazione fatta in java usando il framework **_Spring Boot_** per il Test Finale di Java Enterprise.

[--CLICCA PER CLONARE IL MIO REPOSITORY--](https://github.com/nitinKumarAwasthi/SpringBootTestFinale)



[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

## Requirements

For building and running the application you need:

- [JDK 11](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven ](https://maven.apache.org)
- [![Run in Postman](https://s3.amazonaws.com/postman-static/run-button.png)](https://app.getpostman.com/run-collection/5d9ae743a661a15d64bb)


## Proprietà
Appicazione basata su Spring boot con le seguenti funzioni:
- H2 in memoria
- Restfull API

## Installation

Use this link [clickme](https://spring.io/tools) to install Spring Boot.
```bash
clickme install Spring Boot
```

## Content 
**FIRST DEBUG APPLICATION TO GET TO THE LINK**
**_CREDENTIALS: <br />
Username:  user <br />
Password:  user_**

| Query    |                                                     Url                                                      |                Funzionamento |
|:---------|:------------------------------------------------------------------------------------------------------------:|-----------------------------:|
| `Get`    |                                        http://localhost:8080/prodotti                                        |          StampaTuttiProdotti |
| `Get`    |                                       http://localhost:8080/prodotti/3                                       |          StampaProdottiConId |
| `Get`    |          http://localhost:8080/prodotti/ricercatradatadiacquisto?datada=11-01-2005&dataa=11-01-2019          |      RiceraTraDataDiAcquisto |
| `Get`    |      http://localhost:8080/prodotti/ricercatradatadiacquistoGreaterthan?acquistopiùgrandedi=05-04-2010       |    DataDiAcquistoGreaterthan |
| `Get`    |       http://localhost:8080/prodotti/ricercatradatadiacquistolessthan?acquistopiùpiccolodi=03-05-2010        |       DataDiAcquistoLessThan |
| `Get`    |          http://localhost:8080/prodotti/ricercatradatadiscadenza?datada=20-04-2000&dataa=01-04-2020          |     RicercaTraDataDiScadenza |
| `Get`    |      http://localhost:8080/prodotti/ricercatradatadiscadenzagreaterthan?scadenzapiùgrandedi=03-05-2021       |    DataDiScadenzaGreaterThan |
| `Get`    |       http://localhost:8080/prodotti/ricercatradatadiscadenzalessthan?scadenzapiùpiccolodi=03-04-2021        |       DataDiScadenzaLessThan |
| `Get`    |                   http://localhost:8080/prodotto/ricercabyprezzo?prezzomin=5&prezzomax=10                    |             RicercaConPrezzo |
| `Get`    |                        http://localhost:8080/prodotto/ricercabyprezzomax?prezzomax=15                        |     RicercaConPrezzoLessThan |
| `Get`    |                        http://localhost:8080/prodotto/ricercabyprezzomin?prezzomin=10                        |  RicercaConPrezzoGreaterThan |
| `Get`    |                        http://localhost:8080/prodotto/ricercabyranking?min=0.0&max=5                         |            RicercaConRanking |
| `Get`    |                           http://localhost:8080/prodotto/ricercabyrankingmax?max=5                           |    RicercaConRankingLessThan |
| `Get`    |                           http://localhost:8080/prodotto/ricercabyrankingmin?min=6                           | RicercaConRankingGreaterThan |
| `Post`   |                                        http://localhost:8080/prodotto                                        |              PostNewProdotto |
| `Post`   |                                       http://localhost:8080/caricafile                                       |                   CaricaFile |
| `Put`    |                                       http://localhost:8080/prodotti/7                                       |              AggionaProdotto |
| `Delete` |                                       http://localhost:8080/prodotto/5                                       |              EliminaProdotto |

## Link Utili
[spring initializr](https://start.spring.io/)

## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/codecentric/springboot-sample-app/blob/master/LICENSE) file.