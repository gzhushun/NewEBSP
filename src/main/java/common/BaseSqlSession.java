/**
 * 封装mybatis常用方法
 * 基于使用sqlSession和数据库交互的常规方式
 * @author hushun
 */
package common;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.stereotype.Component;

@Component(value = "baseSqlSession")
public class BaseSqlSession {
	private SqlSessionFactory sessionFactory;

	/*
	 * 默认构造方法，读取mybatisConfig.xml文件
	 */
	public BaseSqlSession() {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
			SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
			sessionFactory = sessionFactoryBuilder.build(inputStream);
		} catch (Exception exception) {
			System.out.println("the error is " + exception);
		}
	}

	/*
	 * 获得单个对象
	 * @Param statement 对应xml的ID
	 * @return 对象
	 */
	public Object getObject(String statement) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get object, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		Object object = sqlSession.selectOne(statement);
		sqlSession.close();
		return object;
	}

	/*
	 * 获得单个对象
	 * @Param statement 对应xml的ID
	 * @param parameter 查询所需的参数，可以是任意格式
	 * @return 对象
	 */
	public Object getObject(String statement, Object parameter) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get object, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		Object object = sqlSession.selectOne(statement, parameter);
		sqlSession.close();
		return object;
	}

	/*
	 * 获得列表
	 * @Param statement 对应xml的ID
	 * @return 对象列表
	 */
	public Object getList(String statement) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get list, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		Object object = sqlSession.selectList(statement);
		sqlSession.close();
		return object;
	}

	/*
	 * 获得列表
	 * @Param statement 对应xml的ID
	 * @param parameter 查询所需的参数，可以是任意格式
	 * @return 对象列表
	 */
	public Object getList(String statement, Object parameter) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get list, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		Object object = sqlSession.selectList(statement, parameter);
		sqlSession.close();
		return object;
	}

	/*
	 * 获得列表(带分页功能)
	 * @Param statement 对应xml的ID
	 * @param parameter 查询所需的参数，可以是任意格式
	 * @param pageNumber 页数
	 * @param pageSize 每页数量
	 * @return 分页查询后的对象列表
	 */
	public Object getList(String statement, Object parameter, int pageNumber, int pageSize) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get list, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		RowBounds rowBounds = new RowBounds(pageNumber, pageSize);
		Object object = sqlSession.selectList(statement, parameter, rowBounds);
		sqlSession.close();
		return object;
	}

	/*
	 * 获得结果集映射
	 * @Param statement 对应xml的ID
	 * @Param mapKey 结果集对应的键
	 * @return 对象列表
	 */
	public Object getMap(String statement, String mapKey) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get map, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		Object object = sqlSession.selectMap(statement, mapKey);
		sqlSession.close();
		return object;
	}

	/*
	 * 获得结果集映射
	 * @Param statement 对应xml的ID
	 * @param parameter 查询所需的参数，可以是任意格式
	 * @Param mapKey 结果集对应的键
	 * @return 对象列表
	 */
	public Object getMap(String statement, Object parameter, String mapKey) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get map, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		Object object = sqlSession.selectMap(statement, parameter, mapKey);
		sqlSession.close();
		return object;
	}

	/*
	 * 获得结果集映射
	 * @Param statement 对应xml的ID
	 * @param parameter 查询所需的参数，可以是任意格式
	 * @param pageNumber 页数
	 * @param pageSize 每页数量
	 * @Param mapKey 结果集对应的键
	 * @return 分页查询后的对象列表
	 */
	public Object getMap(String statement, Object parameter, int pageNumber, int pageSize, String mapKey) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot get map, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		RowBounds rowBounds = new RowBounds(pageNumber, pageSize);
		Object object = sqlSession.selectMap(statement, parameter, mapKey, rowBounds);
		sqlSession.close();
		return object;
	}

	/*
	 * 插入数据
	 * @Param statement 对应xml的ID
	 * @return 插入数据的数量
	 */
	public int insert(String statement) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot insert, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		int insertNumber = sqlSession.insert(statement);
		sqlSession.commit();
		sqlSession.close();
		return insertNumber;
	}

	/*
	 * 插入数据
	 * @Param statement 对应xml的ID
	 * @Param parameter 插入数据所需的参数
	 * @return 插入数据的数量
	 */
	public int insert(String statement, Object parameter) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot insert, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		int insertNumber = sqlSession.insert(statement, parameter);
		sqlSession.commit();
		sqlSession.close();
		return insertNumber;
	}

	/*
	 * 更新数据
	 * @Param statement 对应xml的ID
	 * @return 更新数据的数量
	 */
	public int update(String statement) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot update, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		int updateNumber = sqlSession.update(statement);
		sqlSession.commit();
		sqlSession.close();
		return updateNumber;
	}

	/*
	 * 更新数据
	 * @Param statement 对应xml的ID
	 * @Param parameter 更新数据所需的参数
	 * @return 更新数据的数量
	 */
	public int update(String statement, Object parameter) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot update, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		int updateNumber = sqlSession.update(statement, parameter);
		sqlSession.commit();
		sqlSession.close();
		return updateNumber;
	}

	/*
	 * 删除数据
	 * @Param statement 对应xml的ID
	 * @return 删除数据的数量
	 */
	public int delete(String statement) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot delete, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		int deleteNumber = sqlSession.delete(statement);
		sqlSession.commit();
		sqlSession.close();
		return deleteNumber;
	}

	/*
	 * 删除数据
	 * @Param statement 对应xml的ID
	 * @Param parameter 删除数据所需的参数
	 * @return 删除数据的数量
	 */
	public int delete(String statement, Object parameter) {
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot delete, initial sessionFactory fail.");
		}
		SqlSession sqlSession = sessionFactory.openSession();
		int deleteNumber = sqlSession.delete(statement, parameter);
		sqlSession.commit();
		sqlSession.close();
		return deleteNumber;
	}
	
	/*
	 * 清理Session缓存
	 */
	public void clearCache()
	{
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot clear cache, initial sessionFactory fail.");
		}
		SqlSessionUtils.getSqlSession(sessionFactory).clearCache();
	}
}
