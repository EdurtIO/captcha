# wikift-captcha

wikift 验证码

### 使用方式

```java

CaptchaResultEntity captchaResultEntity = CalculateGenerate.generate();
// 获取验证码图像
captchaResultEntity.getImage();
// 获取验证码结果
captchaResultEntity.getResult();
// 获取验证码表达式
captchaResultEntity.getExpression();

```