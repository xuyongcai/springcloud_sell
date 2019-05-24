# springcloud_sell
微服务项目

### how to use

1. 导入数据库doc/springcloud_sell.sql脚本，创建数据库相关数据

2. 安装 rabbitmq 并启动

3. 安装 redis 并启动

4. 在github搭建配置中心config-repo，设置好webhooks，具体见https://github.com/xuyongcai/config-repo

5. 进入项目config模块，修改配置文件，修改github地址、账号、密码、本地basedir

6. 启动 eureka 服务注册中心模块

7. 启动 config 配置中心模块

8. 启动 其他 模块
