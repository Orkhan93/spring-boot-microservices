package az.spring.productservice.mapper;

import az.spring.productservice.model.Product;
import az.spring.productservice.request.ProductRequest;
import az.spring.productservice.response.ProductResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-22T23:58:05+0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponse fromModelToResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        return productResponse;
    }

    @Override
    public List<ProductResponse> fromModelToListResponse(List<Product> product) {
        if ( product == null ) {
            return null;
        }

        List<ProductResponse> list = new ArrayList<ProductResponse>( product.size() );
        for ( Product product1 : product ) {
            list.add( fromModelToResponse( product1 ) );
        }

        return list;
    }

    @Override
    public Product fromRequestToModel(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        Product product = new Product();

        return product;
    }
}
