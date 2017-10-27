package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.User;
import util.dbUtil;

public class UserDao implements dao.UserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		//获取数据库连接
		Connection connection=dbUtil.getConnect();
		//创建注册用户信息的sql语句
		String sql="insert into user(name,email,password) values(?,?,?)";
		//
		System.out.println("================================"+sql+user.getName()+"\n"+user.getEmailAddress()+"\n"+user.getPassword()+user.getAge());
		try {
			PreparedStatement pStatement=connection.prepareStatement(sql);
			pStatement.setString(1, user.getName());
			pStatement.setString(2, user.getEmailAddress());
			pStatement.setString(3, user.getPassword());
			//执行操作
			pStatement.executeUpdate();
			//释放资源
			pStatement.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("-----------error---------");
			e.printStackTrace();
		}
		
	}

}
