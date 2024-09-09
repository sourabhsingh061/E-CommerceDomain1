package in.co.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.common.BaseCtl;
import in.co.common.DropdownListInt;
import in.co.common.ORSResponse;
import in.co.dto.ProductDTO;
import in.co.form.ProductForm;
import in.co.service.ProductServiceInt;

@RestController
@RequestMapping(value = "Product")
public class ProductCtl extends BaseCtl<ProductForm, ProductDTO, ProductServiceInt> {

	@Autowired
	public ProductServiceInt service;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		ProductDTO dto = new ProductDTO();
		List list = service.search(dto, 0, 5);
		res.addResult("productList", list);
		return res;

	}
}
