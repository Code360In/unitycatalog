package io.unitycatalog.server.sdk.schema;

import io.unitycatalog.client.ApiClient;
import io.unitycatalog.client.ApiException;
import io.unitycatalog.client.api.SchemasApi;
import io.unitycatalog.client.model.CreateSchema;
import io.unitycatalog.client.model.SchemaInfo;
import io.unitycatalog.client.model.UpdateSchema;
import io.unitycatalog.server.base.schema.SchemaOperations;

import java.util.List;

import static io.unitycatalog.server.utils.TestUtils.toList;

public class SdkSchemaOperations implements SchemaOperations {
    private final SchemasApi schemasApi;

    public SdkSchemaOperations(ApiClient apiClient) {
        this.schemasApi = new SchemasApi(apiClient);
    }

    @Override
    public SchemaInfo createSchema(CreateSchema createSchema) throws ApiException {
        return schemasApi.createSchema(createSchema);
    }

    @Override
    public List<SchemaInfo> listSchemas(String catalogName) throws ApiException {
        return schemasApi.listSchemas(catalogName , 100, null).getSchemas();
    }

    @Override
    public SchemaInfo getSchema(String schemaFullName) throws ApiException {
        return schemasApi.getSchema(schemaFullName);
    }

    @Override
    public SchemaInfo updateSchema(String fullName, UpdateSchema updateSchema) throws ApiException {
        return schemasApi.updateSchema(fullName, updateSchema);
    }

    @Override
    public void deleteSchema(String schemaFullName) throws ApiException {
        schemasApi.deleteSchema(schemaFullName);
    }
}
