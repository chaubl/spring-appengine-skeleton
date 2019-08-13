package com.fcs.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Project {
	@Id
	private String id;
	private String platform;
	private String name;
	private Timestamp created_timestamp;
	private Timestamp updated_timestamp;
	@Lob
	private String description;
	@Lob
	private String keywords;
	private String homepage_url;
	private String licenses;
	private String repository_url;
	private Integer sourcerank;
	private Integer versions_count;
	private Timestamp latest_release_publish_timestamp;
	private String latest_release_number;
	private Integer dependent_projects_count;
	private Integer dependent_repositories_count;
	private String language;
	private String status;	
	private String repository_host_type;
	private String repository_name_with_owner;
	@Lob
	private String repository_description;
	private Boolean repository_fork;
	private Timestamp repository_created_timestamp;
	private Timestamp repository_updated_timestamp;
	private Timestamp repository_last_pushed_timestamp;
	private String repository_homepage_url;
	private Integer repository_size;
	private Integer repository_stars_count;
	private String repository_language;
	private Boolean repository_issues_enabled;
	private Boolean repository_wiki_enabled;
	private Boolean repository_pages_enabled;
	private Integer repository_forks_count;
	private String repository_mirror_url;
	private Integer repository_open_issues_count;
	private String repository_default_branch;
	private Integer repository_watchers_count;
	private String repository_uuid;
	private String repository_fork_source_name_with_owner;
	private String repository_license;
	private Integer repository_contributors_count;
	private String repository_readme_filename;
	private String repository_changelog_filename;
	private String repository_contributing_guidelines_filename;
	private String repository_license_filename;
	private String repository_code_of_conduct_filename;
	private String repository_security_threat_model_filename;
	private String repository_security_audit_filename;
	private String repository_status;
	private Integer repository_sourcerank;
	private String repository_display_name;
	private String repository_scm_type;
	private String repository_pull_requests_enabled;
	private String repository_logo_url;
	@Lob
	private String repository_keywords;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(Timestamp created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public Timestamp getUpdated_timestamp() {
		return updated_timestamp;
	}
	public void setUpdated_timestamp(Timestamp updated_timestamp) {
		this.updated_timestamp = updated_timestamp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getHomepage_url() {
		return homepage_url;
	}
	public void setHomepage_url(String homepage_url) {
		this.homepage_url = homepage_url;
	}
	public String getLicenses() {
		return licenses;
	}
	public void setLicenses(String licenses) {
		this.licenses = licenses;
	}
	public String getRepository_url() {
		return repository_url;
	}
	public void setRepository_url(String repository_url) {
		this.repository_url = repository_url;
	}
	public Integer getSourcerank() {
		return sourcerank;
	}
	public void setSourcerank(Integer sourcerank) {
		this.sourcerank = sourcerank;
	}
	public Integer getVersions_count() {
		return versions_count;
	}
	public void setVersions_count(Integer versions_count) {
		this.versions_count = versions_count;
	}
	public Timestamp getLatest_release_publish_timestamp() {
		return latest_release_publish_timestamp;
	}
	public void setLatest_release_publish_timestamp(Timestamp latest_release_publish_timestamp) {
		this.latest_release_publish_timestamp = latest_release_publish_timestamp;
	}
	public String getLatest_release_number() {
		return latest_release_number;
	}
	public void setLatest_release_number(String latest_release_number) {
		this.latest_release_number = latest_release_number;
	}
	public Integer getDependent_projects_count() {
		return dependent_projects_count;
	}
	public void setDependent_projects_count(Integer dependent_projects_count) {
		this.dependent_projects_count = dependent_projects_count;
	}
	public Integer getDependent_repositories_count() {
		return dependent_repositories_count;
	}
	public void setDependent_repositories_count(Integer dependent_repositories_count) {
		this.dependent_repositories_count = dependent_repositories_count;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRepository_host_type() {
		return repository_host_type;
	}
	public void setRepository_host_type(String repository_host_type) {
		this.repository_host_type = repository_host_type;
	}
	public String getRepository_name_with_owner() {
		return repository_name_with_owner;
	}
	public void setRepository_name_with_owner(String repository_name_with_owner) {
		this.repository_name_with_owner = repository_name_with_owner;
	}
	public String getRepository_description() {
		return repository_description;
	}
	public void setRepository_description(String repository_description) {
		this.repository_description = repository_description;
	}
	public Boolean getRepository_fork() {
		return repository_fork;
	}
	public void setRepository_fork(Boolean repository_fork) {
		this.repository_fork = repository_fork;
	}
	public Timestamp getRepository_created_timestamp() {
		return repository_created_timestamp;
	}
	public void setRepository_created_timestamp(Timestamp repository_created_timestamp) {
		this.repository_created_timestamp = repository_created_timestamp;
	}
	public Timestamp getRepository_updated_timestamp() {
		return repository_updated_timestamp;
	}
	public void setRepository_updated_timestamp(Timestamp repository_updated_timestamp) {
		this.repository_updated_timestamp = repository_updated_timestamp;
	}
	public Timestamp getRepository_last_pushed_timestamp() {
		return repository_last_pushed_timestamp;
	}
	public void setRepository_last_pushed_timestamp(Timestamp repository_last_pushed_timestamp) {
		this.repository_last_pushed_timestamp = repository_last_pushed_timestamp;
	}
	public String getRepository_homepage_url() {
		return repository_homepage_url;
	}
	public void setRepository_homepage_url(String repository_homepage_url) {
		this.repository_homepage_url = repository_homepage_url;
	}
	public Integer getRepository_size() {
		return repository_size;
	}
	public void setRepository_size(Integer repository_size) {
		this.repository_size = repository_size;
	}
	public Integer getRepository_stars_count() {
		return repository_stars_count;
	}
	public void setRepository_stars_count(Integer repository_stars_count) {
		this.repository_stars_count = repository_stars_count;
	}
	public String getRepository_language() {
		return repository_language;
	}
	public void setRepository_language(String repository_language) {
		this.repository_language = repository_language;
	}
	public Boolean getRepository_issues_enabled() {
		return repository_issues_enabled;
	}
	public void setRepository_issues_enabled(Boolean repository_issues_enabled) {
		this.repository_issues_enabled = repository_issues_enabled;
	}
	public Boolean getRepository_wiki_enabled() {
		return repository_wiki_enabled;
	}
	public void setRepository_wiki_enabled(Boolean repository_wiki_enabled) {
		this.repository_wiki_enabled = repository_wiki_enabled;
	}
	public Boolean getRepository_pages_enabled() {
		return repository_pages_enabled;
	}
	public void setRepository_pages_enabled(Boolean repository_pages_enabled) {
		this.repository_pages_enabled = repository_pages_enabled;
	}
	public Integer getRepository_forks_count() {
		return repository_forks_count;
	}
	public void setRepository_forks_count(Integer repository_forks_count) {
		this.repository_forks_count = repository_forks_count;
	}
	public String getRepository_mirror_url() {
		return repository_mirror_url;
	}
	public void setRepository_mirror_url(String repository_mirror_url) {
		this.repository_mirror_url = repository_mirror_url;
	}
	public Integer getRepository_open_issues_count() {
		return repository_open_issues_count;
	}
	public void setRepository_open_issues_count(Integer repository_open_issues_count) {
		this.repository_open_issues_count = repository_open_issues_count;
	}
	public String getRepository_default_branch() {
		return repository_default_branch;
	}
	public void setRepository_default_branch(String repository_default_branch) {
		this.repository_default_branch = repository_default_branch;
	}
	public Integer getRepository_watchers_count() {
		return repository_watchers_count;
	}
	public void setRepository_watchers_count(Integer repository_watchers_count) {
		this.repository_watchers_count = repository_watchers_count;
	}
	public String getRepository_uuid() {
		return repository_uuid;
	}
	public void setRepository_uuid(String repository_uuid) {
		this.repository_uuid = repository_uuid;
	}
	public String getRepository_fork_source_name_with_owner() {
		return repository_fork_source_name_with_owner;
	}
	public void setRepository_fork_source_name_with_owner(String repository_fork_source_name_with_owner) {
		this.repository_fork_source_name_with_owner = repository_fork_source_name_with_owner;
	}
	public String getRepository_license() {
		return repository_license;
	}
	public void setRepository_license(String repository_license) {
		this.repository_license = repository_license;
	}
	public Integer getRepository_contributors_count() {
		return repository_contributors_count;
	}
	public void setRepository_contributors_count(Integer repository_contributors_count) {
		this.repository_contributors_count = repository_contributors_count;
	}
	public String getRepository_readme_filename() {
		return repository_readme_filename;
	}
	public void setRepository_readme_filename(String repository_readme_filename) {
		this.repository_readme_filename = repository_readme_filename;
	}
	public String getRepository_changelog_filename() {
		return repository_changelog_filename;
	}
	public void setRepository_changelog_filename(String repository_changelog_filename) {
		this.repository_changelog_filename = repository_changelog_filename;
	}
	public String getRepository_contributing_guidelines_filename() {
		return repository_contributing_guidelines_filename;
	}
	public void setRepository_contributing_guidelines_filename(String repository_contributing_guidelines_filename) {
		this.repository_contributing_guidelines_filename = repository_contributing_guidelines_filename;
	}
	public String getRepository_license_filename() {
		return repository_license_filename;
	}
	public void setRepository_license_filename(String repository_license_filename) {
		this.repository_license_filename = repository_license_filename;
	}
	public String getRepository_code_of_conduct_filename() {
		return repository_code_of_conduct_filename;
	}
	public void setRepository_code_of_conduct_filename(String repository_code_of_conduct_filename) {
		this.repository_code_of_conduct_filename = repository_code_of_conduct_filename;
	}
	public String getRepository_security_threat_model_filename() {
		return repository_security_threat_model_filename;
	}
	public void setRepository_security_threat_model_filename(String repository_security_threat_model_filename) {
		this.repository_security_threat_model_filename = repository_security_threat_model_filename;
	}
	public String getRepository_security_audit_filename() {
		return repository_security_audit_filename;
	}
	public void setRepository_security_audit_filename(String repository_security_audit_filename) {
		this.repository_security_audit_filename = repository_security_audit_filename;
	}
	public String getRepository_status() {
		return repository_status;
	}
	public void setRepository_status(String repository_status) {
		this.repository_status = repository_status;
	}
	public Integer getRepository_sourcerank() {
		return repository_sourcerank;
	}
	public void setRepository_sourcerank(Integer repository_sourcerank) {
		this.repository_sourcerank = repository_sourcerank;
	}
	public String getRepository_display_name() {
		return repository_display_name;
	}
	public void setRepository_display_name(String repository_display_name) {
		this.repository_display_name = repository_display_name;
	}
	public String getRepository_scm_type() {
		return repository_scm_type;
	}
	public void setRepository_scm_type(String repository_scm_type) {
		this.repository_scm_type = repository_scm_type;
	}
	public String getRepository_pull_requests_enabled() {
		return repository_pull_requests_enabled;
	}
	public void setRepository_pull_requests_enabled(String repository_pull_requests_enabled) {
		this.repository_pull_requests_enabled = repository_pull_requests_enabled;
	}
	public String getRepository_logo_url() {
		return repository_logo_url;
	}
	public void setRepository_logo_url(String repository_logo_url) {
		this.repository_logo_url = repository_logo_url;
	}
	public String getRepository_keywords() {
		return repository_keywords;
	}
	public void setRepository_keywords(String repository_keywords) {
		this.repository_keywords = repository_keywords;
	}
}
