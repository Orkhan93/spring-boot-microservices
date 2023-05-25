package az.spring.productservice.mapper;

import az.spring.productservice.model.Product;
import az.spring.productservice.request.ProductRequest;
import az.spring.productservice.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    ProductResponse fromModelToResponse(Product product);

    List<ProductResponse> fromModelToListResponse(List<Product> product);

    Product fromRequestToModel(ProductRequest productRequest);

}