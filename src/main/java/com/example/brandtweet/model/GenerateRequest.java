package com.example.brandtweet.model;

import jakarta.validation.constraints.Size;

public class GenerateRequest {
    @Size(max = 120, message = "Brand name must be 120 characters or fewer")
    private String brandName;

    @Size(max = 160, message = "Industry must be 160 characters or fewer")
    private String industry;

    @Size(max = 80, message = "Campaign objective must be 80 characters or fewer")
    private String objective;

    @Size(max = 2000, message = "Product details must be 2000 characters or fewer")
    private String productDetails;

    @Size(max = 80, message = "Tone must be 80 characters or fewer")
    private String tone;

    @Size(max = 200, message = "Target audience must be 200 characters or fewer")
    private String targetAudience;

    @Size(max = 5000, message = "Example posts must be 5000 characters or fewer")
    private String referencePosts;

    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }

    public String getIndustry() { return industry; }
    public void setIndustry(String industry) { this.industry = industry; }

    public String getObjective() { return objective; }
    public void setObjective(String objective) { this.objective = objective; }

    public String getProductDetails() { return productDetails; }
    public void setProductDetails(String productDetails) { this.productDetails = productDetails; }

    public String getTone() { return tone; }
    public void setTone(String tone) { this.tone = tone; }

    public String getTargetAudience() { return targetAudience; }
    public void setTargetAudience(String targetAudience) { this.targetAudience = targetAudience; }

    public String getReferencePosts() { return referencePosts; }
    public void setReferencePosts(String referencePosts) { this.referencePosts = referencePosts; }
}
