## spring-boot-demo(多模块)

### 1.环境

名称 | 版本
---|---
jdk | 1.8
maven | 3.5.2
spring boot | 2.5.3
mysql 连接驱动 | 8.0.15
mybatis | 2.1.0
fastjson | 1.2.51
Elasticsearch | 7.8.0

### 2. 步骤
- 安装 jdk1.8
- 安装并配置 Maven 3.5.2
  - 安装 Maven
  - 配置 Maven 镜像仓库
  
      ```xml
      <!-- 阿里云仓库 -->
       <mirror>
            <id>alimaven</id>
            <mirrorOf>central</mirrorOf>
            <name>aliyun maven</name>
            <url>http://maven.aliyun.com/nexus/content/repositories/central/</url>
       </mirror>
      ```

- 安装idea（设置字符集 utf8、设置 maven）
  - 设置字符集为 UTF-8：File -> other settings -> Settings for New Projects -> Editor -> File Encodings -> Global Encoding/Project Encoding/Default encoding for properties files
  - 设置 Maven：File -> Settings -> 搜索 maven 并设置
- idea导入maven项目
  - 导入父工程的 pom 即可；
  - 执行父工程的 Maven插件：clean、compile 和 package
- 运行 Application 启动 project

### 3. 说明

模块名称 | 备注
---|---
spring-boot-demo | 父 Project
demo-start | Controller 层
demo-service | Service 层
demo-dao | Dao 层
demo-model | 实体类
demo-base | 基础模块
demo-core | 核心模块

- Application 能运行
- 能访问数据库
- 异常处理
- 日志处理
- 国际化
- 线程池
- 定时任务
- 缓存
- 消息队列