package com.fiuni.sd.brick_management.client.rest.base;

import com.fiuni.sd.bricks_management.dto.base.BaseDTO;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public abstract class BaseResourceImpl<DTO extends BaseDTO> implements IBaseResource<DTO> {
    private final String _resourcePath;
    private final Class<DTO> _dtoClass;
    private final WebResource _webResource;

    private static final String BASE_URL = "http://localhost:28080/isp-platform/rest";
    private static final String TOKEN = "$2a$11$4oHHbmgsIgx9ISBVDn0h6ezUiOD.Pof0TEkFUJFllk3ms7JPjzQFC";


    public BaseResourceImpl(Class<DTO> dtoClass, String resourcePath) {
        _dtoClass = dtoClass;
        _resourcePath = BASE_URL + resourcePath;

        final Client jerseyClient = Client.create();

        _webResource = jerseyClient.resource(_resourcePath);
        //_webResource.header("token", TOKEN);
    }

    protected WebResource getWebResource() {
        return _webResource;
    }

    protected Class<DTO> getDtoClass() {
        return _dtoClass;
    }

    @Override
    public DTO save(DTO dto) {
        return getWebResource().entity(dto).post(getDtoClass());
    }

    @Override
    public DTO getById(Integer id) {
        return getWebResource().path("/" + id).get(getDtoClass());
    }

}
