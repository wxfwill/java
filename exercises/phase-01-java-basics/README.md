# 阶段一练习工程

这是 Java 21、Maven 与 JUnit 5 的最小启动工程，只提供可验证的构建入口，不包含权限菜单练习答案。

## 环境验证

```powershell
java -version
javac -version
mvn -version
mvn test
mvn package
java -cp target\phase-01-java-basics-0.1.0-SNAPSHOT.jar com.wxfwill.learning.App
```

## 实现规则

- 不使用 Lombok。
- 不使用 Spring。
- 不使用数据库。
- 每个新增方法补充简短注释，说明意图或边界。
- 先实现功能，再自行编写测试；不要让 AI 生成完整答案。
- 每次练习至少考虑正常、非法、边界和失败场景。

## 推荐包结构

```text
com.wxfwill.learning.permission.model
com.wxfwill.learning.permission.service
com.wxfwill.learning.permission.exception
com.wxfwill.learning.permission.io
```

包结构仅用于明确职责，不要求提前建立空类。

## 完成顺序

1. 用户、角色、菜单对象。
2. 对象身份、`equals` 与 `hashCode`。
3. 用户角色与角色菜单关联。
4. 菜单过滤、排序、分组和去重。
5. 菜单树构建与递归查找。
6. 自定义异常。
7. CSV 导入。
8. 至少 20 个 JUnit 测试。
9. 删除 `AppTest` 的启动占位测试，替换为真实测试。
10. 完成阶段验收和复盘。

详细任务见 `assignment.md`。
