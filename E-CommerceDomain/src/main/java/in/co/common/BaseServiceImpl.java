package in.co.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BaseServiceImpl<T extends BaseDTO, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {

	@Autowired
	public D baseDao;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(T dto) {
		long pk = baseDao.add(dto);
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(T dto) {
		baseDao.update(dto);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(T dto) {

		baseDao.delete(dto);
	}

	@Transactional(readOnly = true)
	public List search(T dto, int pageNo, int pageSize) {

		return baseDao.search(dto, pageNo, pageSize);
	}

	@Transactional(readOnly = true)
	public T findByPk(long pk) {
		T dto = baseDao.findByPk(pk);
		return dto;
	}

}
