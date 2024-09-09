package in.co.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import in.co.common.BaseDAOImpl;
import in.co.dto.ProductDTO;

@Repository
public class ProductDAOImpl extends BaseDAOImpl<ProductDTO> implements ProductDAOInt {

	@Override
	public Class<ProductDTO> getDTOClass() {
		return ProductDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ProductDTO dto, CriteriaBuilder builder, Root qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getName())) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}
		if (!isEmptyString(dto.getCategory())) {
			whereCondition.add(builder.like(qRoot.get("category"), dto.getCategory() + "%"));
		}
		return whereCondition;
	}

}
