# Java 全栈学习仓库交接文档

更新时间：2026-07-21 15:25

## 当前目标

在 `D:\code\java` 建立与现有前端仓库完全隔离的 Java 全栈学习工作区，按 48 周路线逐步学习 Java 21、Spring Boot 3.x、MySQL、Redis、测试、部署、JVM 与分布式基础。

当前第一目标不是让 AI 生成完整后端项目，而是把学习计划转成可执行的路线、进度清单、练习入口和最小构建骨架。前期必须由学习者手写核心练习并独立调试。

## 仓库边界

- Java 学习仓库：`D:\code\java`
- 现有前端仓库：`D:\code\mframe`
- 所有 Java、SQL、Spring Boot、Docker、MySQL、Redis 和 Nginx 学习资产只放在 `D:\code\java`。
- `D:\code\mframe` 只作为后续 Vue、mframe、Token 自动刷新链路的联调参考，不存放 Java 学习代码。
- 本轮没有修改 `D:\code\mframe` 中的业务文件、文档或原有 `HANDOFF.md`。

## Git 状态

- `D:\code\java` 已初始化为独立 Git 仓库。
- 默认分支：`main`
- 远端：`origin = https://github.com/wxfwill/java.git`
- GitHub 页面已确认远端当时为空仓库，不存在需要合并的历史提交。
- 当前所有学习文件仍为未跟踪状态，尚未执行首次提交。
- 尚未推送远端。

当前状态应通过以下命令重新确认：

```powershell
git -C D:\code\java status --short
git -C D:\code\java branch --show-current
git -C D:\code\java remote -v
```

## 已完成内容

### 仓库规则与总入口

- `AGENTS.md`：长期学习边界、AI 使用限制、代码要求和验证要求。
- `.gitignore`：忽略 Maven 产物、IDE 缓存、日志、密钥、本机配置和数据库数据目录。
- `README.md`：工作区说明、目录结构、环境准备和开始方式。

### 六阶段路线

- `roadmap/phase-01-java-basics.md`
- `roadmap/phase-02-http-sql.md`
- `roadmap/phase-03-spring-boot.md`
- `roadmap/phase-04-security.md`
- `roadmap/phase-05-testing-deployment.md`
- `roadmap/phase-06-jvm-distributed.md`

每个阶段均包含目标、知识点、推荐资料、注意点和阶段验收。

### 进度和复盘

- `progress/48-week-checklist.md`：按周拆分的 48 周执行清单。
- `notes/templates/knowledge-note.md`：知识点沉淀模板。
- `notes/templates/incident-review.md`：故障复盘模板。

### 第一阶段 Maven 骨架

目录：`exercises/phase-01-java-basics`

已创建：

- Java 21 Maven `pom.xml`
- JUnit 5 测试依赖
- 最小 `App.java` 启动入口
- 最小 `AppTest.java` 启动测试
- 第一阶段使用说明
- 权限菜单程序练习任务与至少 20 个测试场景要求

只提供最小构建入口，没有生成用户、角色、菜单、菜单树、CSV 导入或异常处理的业务答案，符合前期手写学习原则。

### 后续阶段占位入口

- `exercises/phase-02-sql`
- `exercises/phase-03-spring`
- `exercises/phase-04-security`
- `exercises/phase-05-operations`
- `exercises/phase-06-jvm`
- `projects/fullstack-admin`
- `infrastructure`

这些目录只包含进入条件和实施边界，没有提前生成后续阶段完整实现。

## 已执行验证

- 已确认 `D:\code\java` 是独立 Git 仓库。
- 已确认分支为 `main`，远端地址配置正确。
- 已确认 `D:\code\mframe` 没有生成 Java 学习目录或相关变更。
- 已使用 XML 解析验证第一阶段 `pom.xml` 格式正确。
- 已检查 Markdown、Java、XML 文件，没有 UTF-8 BOM。
- 已安装 JDK 21 到 `D:\devtools\jdk\temurin-21`。
- 已安装 Maven 3.9.16 到 `D:\devtools\maven\apache-maven-3.9.16`。
- 已将 Maven 本地依赖仓库配置到 `D:\devtools\maven\repository`。
- 已执行 `mvn test`、`mvn package` 和 JAR 运行验证，第一阶段最小骨架通过。

## 当前阻塞与风险

### 环境注意事项

JDK 与 Maven 已写入用户级环境变量。已打开的旧终端可能仍无法识别 `java`、`javac` 或 `mvn`，需要新开 PowerShell 或手动刷新当前会话的 `Path`。

首次 Maven 执行曾在默认位置 `C:\Users\weixf\.m2\repository` 留下约 11 MB 部分缓存，已移动到 `D:\devtools\maven\legacy-c-m2-repository-20260721`，后续 Maven 已切换到 `D:\devtools\maven\repository`。

### GitHub 网络

执行 `git ls-remote https://github.com/wxfwill/java.git` 时，Git CLI 连接 GitHub 443 超时。GitHub 页面可以通过浏览器侧访问，但首次推送仍可能受到当前网络、代理或公司出口限制。

禁止因为远端连接失败而反复修改仓库内容或重新初始化 Git。应先检查代理、网络和 GitHub 认证，再重放一次原始推送。

### 未提交文件

当前文件全部未提交。下一会话不要误认为仓库已完成首次提交或已推送。

## 下一步计划

### 1. 重新验证 JDK 21 和 Maven

新开 PowerShell 后执行：

```powershell
java -version
javac -version
$env:JAVA_HOME
```

确保 Java 主版本为 21，Maven home 为 `D:\devtools\maven\apache-maven-3.9.16`，Java home 为 `D:\devtools\jdk\temurin-21`。

### 2. 重放第一阶段最小构建

```powershell
Set-Location D:\code\java\exercises\phase-01-java-basics
mvn test
mvn package
java -cp target\phase-01-java-basics-0.1.0-SNAPSHOT.jar com.wxfwill.learning.App
```

预期输出：

```text
Phase 01 Java basics workspace is ready.
```

该验证已通过一次。后续如果 Maven 下载依赖失败，先保留完整错误、仓库地址和代理信息，不要立即切换大量镜像或修改 POM。

### 3. 完成首次提交

构建已通过，检查 diff 后再提交：

```powershell
git -C D:\code\java status --short
git -C D:\code\java diff --check
git -C D:\code\java add .
git -C D:\code\java commit -m "chore: initialize Java full-stack learning workspace"
```

提交前必须确认没有本机路径、密码、Token、Cookie、代理凭据或公司内部敏感配置。

### 4. 推送远端

```powershell
git -C D:\code\java push -u origin main
```

若仍然无法连接 GitHub，优先核对当前网络或 Git 代理；不要重复 `git init`，也不要重新添加不同远端覆盖当前配置。

### 5. 开始第 1 周学习

- 在 `progress/48-week-checklist.md` 填写开始日期和固定学习时段。
- 阅读 `roadmap/phase-01-java-basics.md`。
- 阅读 `exercises/phase-01-java-basics/assignment.md`，但不要生成完整答案。
- 从类型、对象、构造器和 Maven 基础开始。
- 每个主题使用 `notes/templates/knowledge-note.md` 记录理解和踩坑。

## 绝对不要重复的错误

- 不要把 Java 学习文件写入 `D:\code\mframe`。
- 不要覆盖或修改 `D:\code\mframe\HANDOFF.md`。
- 不要在未验证新终端环境变量时误判 JDK/Maven 安装失败。
- 不要在第一阶段让 AI 生成完整权限菜单程序和 20 个测试答案。
- 不要跳过 Java、SQL 和事务基础直接创建大型 Spring Boot 项目。
- 不要把所有后续阶段一次性实现出来。
- 不要因为 GitHub 网络失败而重新初始化仓库或破坏本地 Git 历史。
- 不要提交密钥、Token、Cookie、数据库数据目录或本机私有配置。

## 下一会话优先确认

1. 新 PowerShell 是否能直接识别 `java`、`javac` 和 `mvn`。
2. GitHub 网络与认证是否允许首次推送。
3. 首次提交前仓库是否只包含预期学习文件。
4. 是否需要保留或删除 `D:\devtools\maven\legacy-c-m2-repository-20260721` 中的 Maven 旧缓存备份。
