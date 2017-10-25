<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	
    <title>注册</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/UserRegister" method="post" onsubmit="return reg(this)">
    <table align="center" border="0" width="500">
        <tr>
            <td align="right" width="30%">用户名</td>
            <td><input type="text" name="username" class="box"></td>
        </tr>

        <tr>
            <td align="right" width="30%">密码</td>
            <td><input type="password" name="password" class="box"></td>
        </tr>
        <tr>
            <td align="right" width="30%">确认密码</td>
            <td><input type="password" name="password" class="box"></td>
        </tr>
        <tr>
            <td align="right" width="30%">性别</td>
            <td>
                <input type="radio" name="gender" value="男" checked="checked">
                <input type="radio" name="gender" value="女">
            </td>
        </tr>
        <tr>
            <td align="right" width="30%">邮箱</td>
            <td><input type="text" name="email" class="box"></td>
        </tr>
        <tr>
            <td colspan="2" align="center" height="40">
                <input type="submit" value="提交">
<!--                 <input type="reset" value="充值">
 -->            </td>
        </tr>
    </table>
</form>
</body>
</html>

