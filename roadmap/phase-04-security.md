# 阶段四：认证、授权与通用能力

## 目标

实现可测试的登录、Token 刷新、RBAC、数据权限、Redis 与审计日志能力。

## 知识点

- Spring Security Filter Chain、Security Context、Authentication、Authorization
- Password Encoder、Session、JWT、OAuth2 Resource Server、Method Security
- CSRF、CORS、用户、角色、菜单、按钮、接口和数据权限
- Access Token、Refresh Token、吊销、过期、重放与并发刷新
- Redis、缓存、日志、文件、Excel、任务、幂等、限流和脱敏

## 主资料

- Spring Security Reference
- Redis Developer Documentation
- Spring Caching Guide
- OWASP Top 10

## 练习

围绕现有前端 Token 自动刷新链路实现登录、签发、刷新、并发刷新控制、刷新失败退出、权限校验、操作日志和错误码契约。

## 注意点

- 前端校验改善体验，后端校验保证安全和数据正确。
- 默认请求可能被篡改、重放、并发执行或来自旧客户端。
- Token 生命周期、权限模型、缓存与幂等必须由学习者先完成设计。

## 验收

能够画出认证时序，解释 Security Filter Chain，实现 RBAC，并覆盖登录、过期、越权和刷新失败测试。
