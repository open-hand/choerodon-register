# Eureka Server

 Eureka registration center, for local testing only, please using `go-register-server` if you are online. Registration center will send the message to kafka of topic `register-server` when a service up, after receiving the message, `manager-service` do the corresponding processing, such as refresh permissions. 

## Requirements
- Need to use together with kafka.

## Installation and Getting Started
- Switch to the directory of project, run `mvn spring-boot:run` or running in `EurekaServerApplication`, which running in idea.

## Dependencies
- Kafka 

## Reporting Issues

If you find any shortcomings or bugs, please describe them in the [issue](https://github.com/choerodon/choerodon/issues/new?template=issue_template.md).
    
## How to Contribute
Pull requests are welcome! [Follow](https://github.com/choerodon/choerodon/blob/master/CONTRIBUTING.md) to know for more information on how to contribute.

## Note
- For local testing only.