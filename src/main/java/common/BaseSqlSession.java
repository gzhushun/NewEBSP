/**
 * ��װmybatis���÷���
 * ����ʹ��sqlSession�����ݿ⽻���ĳ��淽ʽ
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
	 * Ĭ�Ϲ��췽������ȡmybatisConfig.xml�ļ�
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
	 * ��õ�������
	 * @Param statement ��Ӧxml��ID
	 * @return ����
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
	 * ��õ�������
	 * @Param statement ��Ӧxml��ID
	 * @param parameter ��ѯ����Ĳ����������������ʽ
	 * @return ����
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
	 * ����б�
	 * @Param statement ��Ӧxml��ID
	 * @return �����б�
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
	 * ����б�
	 * @Param statement ��Ӧxml��ID
	 * @param parameter ��ѯ����Ĳ����������������ʽ
	 * @return �����б�
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
	 * ����б�(����ҳ����)
	 * @Param statement ��Ӧxml��ID
	 * @param parameter ��ѯ����Ĳ����������������ʽ
	 * @param pageNumber ҳ��
	 * @param pageSize ÿҳ����
	 * @return ��ҳ��ѯ��Ķ����б�
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
	 * ��ý����ӳ��
	 * @Param statement ��Ӧxml��ID
	 * @Param mapKey �������Ӧ�ļ�
	 * @return �����б�
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
	 * ��ý����ӳ��
	 * @Param statement ��Ӧxml��ID
	 * @param parameter ��ѯ����Ĳ����������������ʽ
	 * @Param mapKey �������Ӧ�ļ�
	 * @return �����б�
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
	 * ��ý����ӳ��
	 * @Param statement ��Ӧxml��ID
	 * @param parameter ��ѯ����Ĳ����������������ʽ
	 * @param pageNumber ҳ��
	 * @param pageSize ÿҳ����
	 * @Param mapKey �������Ӧ�ļ�
	 * @return ��ҳ��ѯ��Ķ����б�
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
	 * ��������
	 * @Param statement ��Ӧxml��ID
	 * @return �������ݵ�����
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
	 * ��������
	 * @Param statement ��Ӧxml��ID
	 * @Param parameter ������������Ĳ���
	 * @return �������ݵ�����
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
	 * ��������
	 * @Param statement ��Ӧxml��ID
	 * @return �������ݵ�����
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
	 * ��������
	 * @Param statement ��Ӧxml��ID
	 * @Param parameter ������������Ĳ���
	 * @return �������ݵ�����
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
	 * ɾ������
	 * @Param statement ��Ӧxml��ID
	 * @return ɾ�����ݵ�����
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
	 * ɾ������
	 * @Param statement ��Ӧxml��ID
	 * @Param parameter ɾ����������Ĳ���
	 * @return ɾ�����ݵ�����
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
	 * ����Session����
	 */
	public void clearCache()
	{
		if (sessionFactory == null) {
		      throw new SqlSessionException("Error:  Cannot clear cache, initial sessionFactory fail.");
		}
		SqlSessionUtils.getSqlSession(sessionFactory).clearCache();
	}
}
