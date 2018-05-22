# eureka-server

 eureka registration center, for local testing only, please using `go-register-server` if you are online. The API send the message of server starting to `register-server` topic of kafka, after receiving the message, `manager-service` do the corresponding processing, such as refresh permissions. 

## Requirements
- need to use together with kafka

## Installation and Getting Started
- switch to the directory of project, run `mvn spring-boot:run` or running in `EurekaServerApplication`, which running in idea.

## Dependencies
- kafka 

## Reporting Issues

If you find any shortcomings or bugs, please describe them in the [issue](https://github.com/choerodon/choerodon/issues/new?template=issue_template.md).
    
## How to Contribute
Pull requests are welcome! [Follow](https://github.com/choerodon/choerodon/blob/master/CONTRIBUTING.md) to know for more information on how to contribute.

## Note
- For local testing only