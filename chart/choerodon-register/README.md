# choerodon-register

Registration center of Choerodon.

## Installing the Chart

To install the chart with the release name `choerodon-register`:

```console
$ helm repo add c7n https://openchart.choerodon.com.cn/choerodon/c7n
$ helm repo update
$ helm install choerodon-register c7n/choerodon-register
```

Specify each parameter using the `--set key=value[,key=value]` argument to `helm install`.

## Uninstalling the Chart

```bash
$ helm delete choerodon-register
```

## Requirements

| Repository | Name | Version |
|------------|------|---------|
| https://openchart.choerodon.com.cn/choerodon/c7n | common | 1.x.x |

## Values

| Key | Type | Default | Description |
|-----|------|---------|-------------|
| affinity | object | `{}` | Affinity for pod assignment. Evaluated as a template. Note: podAffinityPreset, podAntiAffinityPreset, and nodeAffinityPreset will be ignored when it's set |
| args | list | `[]` | Args for running the choerodon-register container (set to default if not set). Use array form |
| automountServiceAccountToken | bool | `false` | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted. |
| base.pullPolicy | string | `"IfNotPresent"` | Specify a imagePullPolicy |
| base.pullSecrets | list | `[]` | Optionally specify an array of imagePullSecrets. |
| base.registry | string | `"registry.cn-shanghai.aliyuncs.com"` | Java base image registry |
| base.repository | string | `"c7n/javabase"` | Java base image repository |
| base.tag | string | `"jdk8u282-b08"` | Java base image tag |
| command | list | `[]` | Command for running the choerodon-register container (set to default if not set). Use array form |
| commonAnnotations | object | `{}` | Add annotations to all the deployed resources |
| commonLabels | object | `{}` | Add labels to all the deployed resources |
| containerPort.actuatorPort | int | `8001` | DevOps server management port |
| containerPort.serverPort | int | `8000` | DevOps server port |
| customLivenessProbe | object | `{}` | Custom Liveness |
| customReadinessProbe | object | `{}` | Custom Readiness |
| customStartupProbe | object | `{}` | Custom Startup probes |
| enableServiceLinks | bool | `false` | EnableServiceLinks indicates whether information about services should be injected into pod's environment variables,  matching the syntax of Docker links. Optional: Defaults to false. |
| extraEnv.EUREKA_CLIENT_FETCH_REGISTRY | bool | `false` | Eureka client fetch registry |
| extraEnv.EUREKA_CLIENT_REGISTER_WITH_EUREKA | bool | `false` | Eureka client register with eureka |
| extraEnv.EUREKA_CLIENT_SERVICEURL_DEFAULTZONE | string | `"http://register-server:8000/eureka/"` | Eureka client service url |
| extraEnvVarsCM | string | `""` | ConfigMap with extra environment variables |
| extraEnvVarsSecret | string | `""` | Secret with extra environment variables |
| extraVolumeMounts | list | `[]` | Extra volume mounts to add to choerodon-register containers |
| extraVolumes | list | `[]` | Extra volumes to add to the choerodon-register statefulset |
| fullnameOverride | string | `nil` | String to fully override common.names.fullname template |
| global.imagePullSecrets | list | `[]` | Global Docker registry secret names as an array |
| global.imageRegistry | string | `nil` | Global Docker image registry |
| global.storageClass | string | `nil` | Global StorageClass for Persistent Volume(s) |
| hostAliases | list | `[]` | choerodon-register pod host aliases |
| image.pullPolicy | string | `"IfNotPresent"` | Specify a imagePullPolicy. Defaults to 'Always' if image tag is 'latest', else set to 'IfNotPresent' |
| image.pullSecrets | list | `[]` | Optionally specify an array of imagePullSecrets. Secrets must be manually created in the namespace. |
| image.registry | string | `"registry.cn-shanghai.aliyuncs.com"` | DevOps service image registry |
| image.repository | string | `"c7n/choerodon-register"` | DevOps service image repository |
| image.tag | string | `nil` | DevOps service image tag. Default Chart.AppVersion |
| ingress.annotations | object | `{}` | Additional annotations for the Ingress resource. To enable certificate autogeneration, place here your cert-manager annotations. |
| ingress.apiVersion | string | `""` | Force Ingress API version (automatically detected if not set) |
| ingress.enabled | bool | `false` | Enable ingress record generation for Discourse |
| ingress.extraHosts | list | `[]` | An array with additional hostname(s) to be covered with the ingress record |
| ingress.extraPaths | list | `[]` | An array with additional arbitrary paths that may need to be added to the ingress under the main host |
| ingress.extraTls | list | `[]` | TLS configuration for additional hostname(s) to be covered with this ingress record |
| ingress.hostname | string | `"server.local"` | Default host for the ingress record |
| ingress.ingressClassName | string | `""` | IngressClass that will be be used to implement the Ingress (Kubernetes 1.18+) |
| ingress.path | string | `"/"` | Default path for the ingress record |
| ingress.pathType | string | `"ImplementationSpecific"` | Ingress path type |
| ingress.secrets | list | `[]` | Custom TLS certificates as secrets |
| ingress.selfSigned | bool | `false` | Create a TLS secret for this ingress record using self-signed certificates generated by Helm |
| ingress.tls | bool | `false` | Enable TLS configuration for the host defined at `ingress.hostname` parameter |
| initContainers | object | `{}` | Add init containers to the choerodon-register pods. |
| initDatabases.affinity | object | `{}` | Affinity for pod assignment. Evaluated as a template. Note: podAffinityPreset, podAntiAffinityPreset, and nodeAffinityPreset will be ignored when it's set |
| initDatabases.datasource.driver | string | `"com.mysql.jdbc.Driver"` |  |
| initDatabases.datasource.password | string | `"password"` |  |
| initDatabases.datasource.url | string | `"jdbc:mysql://localhost:3306/?useUnicode=true&characterEncoding=utf-8&useSSL=false&useInformationSchema=true&remarks=true&serverTimezone=Asia/Shanghai"` |  |
| initDatabases.datasource.username | string | `"username"` |  |
| initDatabases.datasources.platform.driver | string | `"com.mysql.jdbc.Driver"` |  |
| initDatabases.datasources.platform.password | string | `"password"` |  |
| initDatabases.datasources.platform.url | string | `"jdbc:mysql://localhost:3306/?useUnicode=true&characterEncoding=utf-8&useSSL=false&useInformationSchema=true&remarks=true&serverTimezone=Asia/Shanghai"` |  |
| initDatabases.datasources.platform.username | string | `"username"` |  |
| initDatabases.enabled | bool | `false` |  |
| initDatabases.exclusion | string | `""` | Excluding update certain tables or fields: table1,table2.column1 |
| initDatabases.nodeSelector | object | `{}` | Node labels for pod assignment. Evaluated as a template. |
| initDatabases.pullPolicy | string | `"IfNotPresent"` | Specify a imagePullPolicy. Defaults to 'Always' if image tag is 'latest', else set to 'IfNotPresent' |
| initDatabases.pullSecrets | list | `[]` | Optionally specify an array of imagePullSecrets. Secrets must be manually created in the namespace. |
| initDatabases.registry | string | `"registry.cn-shanghai.aliyuncs.com"` | DB tool image registry |
| initDatabases.repository | string | `"c7n/dbtool"` | DB tool image repository |
| initDatabases.tag | string | `"0.7.5"` | DB tool image tag. Default Chart.AppVersion |
| initDatabases.timeout | int | `1800` |  |
| initDatabases.tolerations | list | `[]` | Tolerations for pod assignment. Evaluated as a template. |
| kubeVersion | string | `nil` | Force target Kubernetes version (using Helm capabilites if not set) |
| livenessProbe.enabled | bool | `true` | Enable livenessProbe |
| livenessProbe.failureThreshold | int | `5` | Failure threshold for livenessProbe |
| livenessProbe.initialDelaySeconds | int | `480` | Initial delay seconds for livenessProbe |
| livenessProbe.periodSeconds | int | `5` | Period seconds for livenessProbe |
| livenessProbe.successThreshold | int | `1` | Success threshold for livenessProbe |
| livenessProbe.timeoutSeconds | int | `3` | Timeout seconds for livenessProbe |
| nameOverride | string | `nil` | String to partially override common.names.fullname template (will maintain the release name) |
| nodeAffinityPreset.key | string | `""` | Node label key to match |
| nodeAffinityPreset.type | string | `""` | Node affinity type. Allowed values: soft, hard |
| nodeAffinityPreset.values | list | `[]` | Node label values to match |
| nodeSelector | object | `{}` | Node labels for pod assignment. Evaluated as a template. |
| persistence.accessModes | list | `["ReadWriteOnce"]` | Persistent Volume Access Mode |
| persistence.annotations | object | `{}` | Persistent Volume Claim annotations |
| persistence.enabled | bool | `false` | If true, use a Persistent Volume Claim, If false, use emptyDir |
| persistence.existingClaim | string | `nil` | Enable persistence using an existing PVC |
| persistence.mountPath | string | `"/data"` | Data volume mount path |
| persistence.size | string | `"8Gi"` | Persistent Volume size |
| persistence.storageClass | string | `nil` | Persistent Volume Storage Class |
| podAffinityPreset | string | `""` | Pod affinity preset. Allowed values: soft, hard |
| podAnnotations | object | `{}` | Pod annotations |
| podAntiAffinityPreset | string | `"soft"` | Pod anti-affinity preset. Allowed values: soft, hard |
| podLabels | object | `{}` | Pod labels |
| podManagementPolicy | string | `"Parallel"` |  |
| readinessProbe.enabled | bool | `true` | Enable readinessProbe |
| readinessProbe.failureThreshold | int | `5` | Failure threshold for readinessProbe |
| readinessProbe.initialDelaySeconds | int | `30` | Initial delay seconds for readinessProbe |
| readinessProbe.periodSeconds | int | `5` | Period seconds for readinessProbe |
| readinessProbe.successThreshold | int | `1` | Success threshold for readinessProbe |
| readinessProbe.timeoutSeconds | int | `3` | Timeout seconds for readinessProbe |
| replicaCount | int | `1` | Number of deployment replicas |
| resources.limits | object | `{"memory":"2Gi"}` | The resources limits for the init container |
| resources.requests | object | `{"memory":"2Gi"}` | The requested resources for the init container |
| schedulerName | string | `nil` | Scheduler name |
| securityContext | object | `{"enabled":true,"fsGroup":33,"runAsUser":33}` | Security Context |
| service.annotations | object | `{}` | Provide any additional annotations which may be required. This can be used to set the LoadBalancer service type to internal only. |
| service.enabled | bool | `true` | Set to true to enable service record generation |
| service.externalTrafficPolicy | string | `"Cluster"` | Enable client source IP preservation |
| service.loadBalancerIP | string | `nil` | loadBalancerIP for the choerodon-register Service (optional, cloud specific) |
| service.loadBalancerSourceRanges | list | `[]` | Load Balancer sources |
| service.nodePort | object | `{"actuator":30091,"server":30090}` | Specify the nodePort value for the LoadBalancer and NodePort service types. |
| service.port | object | `{"actuator":8001,"server":8000}` | choerodon-register Service port |
| service.type | string | `"ClusterIP"` | choerodon-register Service type |
| serviceAccount.create | bool | `false` | Set to true to create serviceAccount |
| serviceAccount.name | string | `""` | The name of the ServiceAccount to use. |
| sidecars | object | `{}` | Add sidecars to the choerodon-register pods. |
| skywalking.collectorService | string | `"oap.skywalking:11800"` | Collector SkyWalking trace receiver service addresses. |
| skywalking.commandOverride | string | `nil` | String to fully override Skywalking Agent Configuration template |
| skywalking.enabled | bool | `false` | Enable skywalking |
| skywalking.pullPolicy | string | `"IfNotPresent"` | Specify a imagePullPolicy Defaults to 'Always' if image tag is 'latest', else set to 'IfNotPresent' |
| skywalking.pullSecrets | list | `[]` | Optionally specify an array of imagePullSecrets. Secrets must be manually created in the namespace. |
| skywalking.registry | string | `"registry.cn-shanghai.aliyuncs.com"` | Skywalking image registry |
| skywalking.repository | string | `"c7n/skywalking-agent"` | Skywalking image repository |
| skywalking.sampleNPer3Secs | int | `9` | Negative or zero means off, by default. sampleNPer3Secs means sampling N TraceSegment in 3 seconds tops. |
| skywalking.serviceName | string | `nil` | The serviceName (Default .Chart.Name) to represent a logic group providing the same capabilities/logic.  Suggestion: set a unique name for every logic service group, service instance nodes share the same code,Max length is 50(UTF-8 char). |
| skywalking.tag | string | `"8.10.0"` | Skywalking image tag |
| startupProbe.enabled | bool | `false` | Enable startupProbe |
| startupProbe.failureThreshold | int | `60` | Failure threshold for startupProbe |
| startupProbe.initialDelaySeconds | int | `0` | Initial delay seconds for startupProbe |
| startupProbe.periodSeconds | int | `5` | Period seconds for startupProbe |
| startupProbe.successThreshold | int | `1` | Success threshold for startupProbe |
| startupProbe.timeoutSeconds | int | `3` | Timeout seconds for startupProbe |
| tolerations | list | `[]` | Tolerations for pod assignment. Evaluated as a template. |
| updateStrategy.rollingUpdate | object | `{"maxSurge":"100%","maxUnavailable":0}` | Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. |
| updateStrategy.type | string | `"RollingUpdate"` | Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate. |
| volumePermissionsEnabled | bool | `false` | Change the owner and group of the persistent volume mountpoint to runAsUser:fsGroup values from the securityContext section. |
| workingDir | string | `"/opt/choerodon"` | Container's working directory(Default mountPath). |

## Maintainers

| Name | Email | Url |
| ---- | ------ | --- |
| choerodon | zhuchiyu@vip.hand-china.com | https://choerodon.io |
