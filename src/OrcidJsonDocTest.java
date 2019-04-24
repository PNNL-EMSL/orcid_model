import com.example.*;
import com.google.gson.Gson;

import java.util.ArrayList;

public class OrcidJsonDocTest{
	public static OrcidDate buildDate(String yearString, String monthString, String dayString){
        OrcidDate orcidDate = new OrcidDate();

		orcidDate.setYear(new StringValue(yearString));
		orcidDate.setMonth(new StringValue(monthString));
		orcidDate.setDay(new StringValue(dayString));

		return orcidDate;
	}

	public static Title buildTitle(String titleString){
		Title title = new Title();
		title.setTitle(new StringValue(titleString));
		return title;
	}

	public static ExternalId buildExternalId(String externalIdType, String externalIdValue, String externalIdUrlString){
		ExternalId externalId = new ExternalId();

		externalId.setExternalIdType(externalIdType);
		externalId.setExternalIdValue(externalIdValue);
		if(externalIdUrlString != null)
			externalId.setExternalIdUrl(new StringValue(externalIdUrlString));
		else
			externalId.setExternalIdUrl(null);

		externalId.setExternalIdRelationship("self");

		return externalId;
	}

	public static Organization buildOrganization(String name,
			String city,
			String region,
			String country,
			String orgIdentifier,
			String orgIdentifierSource){
		Organization org = new Organization();

		org.setName(name);

		Address orgAddress = new Address();
		orgAddress.setCity(city);
		orgAddress.setRegion(region);
		orgAddress.setCountry(country);
		org.setAddress(orgAddress);

		DisambiguatedOrganization disabmguatedOrg = new DisambiguatedOrganization();
		disabmguatedOrg.setDisambiguatedOrganizationIdentifier(orgIdentifier);
		disabmguatedOrg.setDisambiguationSource(orgIdentifierSource);
		org.setDisambiguatedOrganization(disabmguatedOrg);

		return org;
	}

	public static ResourceItem buildResourceItem(String resourceName, String resourceType, Organization org, ExternalId externalId, String resourceUrl){
		ResourceItem resourceItem = new ResourceItem();
		resourceItem.setResourceName(resourceName);
		resourceItem.setResourceType(resourceType);

		Hosts hosts = new Hosts();
		ArrayList<Organization> orgList = new ArrayList<>();
		orgList.add(org);
		hosts.setOrganization(orgList);
		resourceItem.setHosts(hosts);

		ExternalIds externalIds = new ExternalIds();
		ArrayList<ExternalId> externalIdList = new ArrayList<>();
		externalIdList.add(externalId);
		externalIds.setExternalId(externalIdList);
		resourceItem.setExternalIds(externalIds);

		if(resourceUrl != null)
			resourceItem.setUrl(new StringValue(resourceUrl));

		return resourceItem;
	}

	public static void main(String[] args)
	{
		ResearchResource researchResource = new ResearchResource();
		researchResource.setPutCode("1301");
		// Build Proposal
		Proposal proposal = new Proposal();
        // Build start-date
		proposal.setStartDate(buildDate("2018","10","01"));
        // Build end-date
		proposal.setEndDate(buildDate("2020","09","31"));
        // Build Title
		proposal.setTitle(buildTitle("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        // Build ExternalIds(ExternalIds)

		ExternalIds externalIds = new ExternalIds();
        // Build PartnerExternalId
		ExternalId partnerExternalId = buildExternalId("other-id","Project ID 12345","https://genome.jgi.doe.gov/portal/");
        // Build EMSL external ID
		ExternalId emslExternalId = buildExternalId("doi","10.25582/v01.proj.2018.12345","https://www.emsl.pnnl.gov/emslweb/10.25582/proj.2018.12345");
		ArrayList<ExternalId> externalIdList = new ArrayList<>();
		externalIdList.add(partnerExternalId);
		externalIdList.add(emslExternalId);
		externalIds.setExternalId(externalIdList);
		proposal.setExternalIds(externalIds);


        // Build Hosts (Hosts)
		Hosts hosts = new Hosts();
        // Build Partner Organization (Organization)
		Organization partnerOrg = buildOrganization("Joint Genome Institute","Walnut Creek","CA","US","grid.451309.a","GRID");
        // Build EMSL Organization
		Organization emslOrg = buildOrganization("Environmental Molecular Sciences Laboratory","Richland","WA","US","grid.436923.9","GRID");

		ArrayList<Organization> organizationsList = new ArrayList<>();
		organizationsList.add(partnerOrg);
		organizationsList.add(emslOrg);
		hosts.setOrganization(organizationsList);
		proposal.setHosts(hosts);

		researchResource.setProposal(proposal);

		// Build resource-items
        // Build Infrastructures (List<ResourceItem>)
		ArrayList<ResourceItem> resourceItems = new ArrayList<>();
        // Build partner infrastructure (ResourceItem)
        ResourceItem partnerResourceItem = buildResourceItem("Joint Genome Institute","infrastructures",
                partnerOrg,buildExternalId("uri","https://jgi.doe.gov/",null),null);
        resourceItems.add(partnerResourceItem);

        ResourceItem emslResourceItem = buildResourceItem("EMSL Facility","infrastructures",
                emslOrg,buildExternalId("uri","https://www.emsl.pnnl.gov/emslweb",null),null);
        resourceItems.add(emslResourceItem);

		ResourceItem instrumentResourceItem = buildResourceItem("Electron Microscope","equipment",
				emslOrg,buildExternalId("uri","https://www.emsl.pnnl.gov/emslweb/10.25582/inst.12345",null),null);
		resourceItems.add(instrumentResourceItem);


        researchResource.setResourceItem(resourceItems);

		Gson gson = new Gson();
		String jsonString = gson.toJson(researchResource);
		System.out.println(jsonString);

	}
}