# maven-archetypes
## 使用事项

### 安装maven脚手架

1. 进入脚手架项目根目录，打开命令行，执行mvn archetype:create-from-project
2. 进入脚手架项目中的target/generated-sources/archetype目录下，打开命令行，执行mvn install

### 通过maven脚手架创建新项目

- ```
  mvn archetype:generate 
  -DarchetypeGroupId=com.aaa （脚手架的groupId）
  -DarchetypeArtifactId=archetype-project-01 （脚手架的artifactId）
  -DarchetypeVersion=1.0.0 （脚手架的版本号）
  -DgroupId=com.aaa （新项目的groupId）
  -DartifactId=demo-project （新项目的artifactId）
  -Dversion=1.0.0-SNAPSHOT （新项目的版本号）
  -DarchetypeCatalog=local （internal-使用私有仓库的脚手架jar包，前提需要已把脚手架发布到私有仓库；local-使用本地仓库脚手架jar包；如果不配置，它会到中央仓库去下载，从而导致失败）
  -X （debug模式）
  ```
若执行上述命令后出现错误信息 ` The goal you specified requires a project to execute but there is no POM in this directory`，那么可尝试换使用以下命令
- ```
  mvn archetype:generate 
  "-DarchetypeGroupId=com.aaa" 
  "-DarchetypeArtifactId=archetype-project-01"
  "-DarchetypeVersion=1.0.0" 
  "-DgroupId=com.aaa" 
  "-DartifactId=demo-project" 
  "-Dversion=1.0.0-SNAPSHOT" 
  "-DarchetypeCatalog=local" 
  "-X" 
  ```
  
