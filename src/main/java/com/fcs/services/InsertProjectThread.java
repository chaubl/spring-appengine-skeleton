package com.fcs.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fcs.models.Project;
import com.fcs.repositories.ProjectRepository;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.FieldValueList;
import com.google.cloud.bigquery.Job;
import com.google.cloud.bigquery.JobException;
import com.google.cloud.bigquery.JobId;
import com.google.cloud.bigquery.JobInfo;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.TableResult;

@Component
@Scope("prototype")
public class InsertProjectThread extends Thread {
	
	public ProjectRepository projectRepository;

	@Override
	public void run() {
		System.out.println("InsertProjectThread is running");
				
		BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
		QueryJobConfiguration queryConfig = QueryJobConfiguration
				.newBuilder(
						"SELECT * FROM `bigquery-public-data.libraries_io.projects_with_repository_fields` ORDER BY id LIMIT 5000 OFFSET 0")
				// Use standard SQL syntax for queries.
				// See: https://cloud.google.com/bigquery/sql-reference/
				.setUseLegacySql(false).build();

		// Create a job ID so that we can safely retry.
		JobId jobId = JobId.of(UUID.randomUUID().toString());
		Job queryJob = bigquery.create(JobInfo.newBuilder(queryConfig).setJobId(jobId).build());

		// Wait for the query to complete.
		try {
			queryJob = queryJob.waitFor();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Check for errors
		if (queryJob == null) {
			throw new RuntimeException("Job no longer exists");
		} else if (queryJob.getStatus().getError() != null) {
			// You can also look at queryJob.getStatus().getExecutionErrors() for all
			// errors, not just the latest one.
			throw new RuntimeException(queryJob.getStatus().getError().toString());
		}

		// Get the results.
		TableResult result = null;
		try {
			result = queryJob.getQueryResults();
		} catch (JobException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArrayList<Project> listProjects = new ArrayList<Project>();
		// Print all pages of the results.
		for (FieldValueList row : result.iterateAll()) {
			Project project = new Project();
			project.setId(row.get("platform").getStringValue()+"/"+row.get("name").getStringValue());
			project.setPlatform(row.get("platform").getStringValue());
			project.setName(row.get("name").getStringValue());			
			
			try {
				project.setCreated_timestamp(new Timestamp(row.get("created_timestamp").getTimestampValue()/1000));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setUpdated_timestamp(new Timestamp(row.get("updated_timestamp").getTimestampValue()/1000));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setDescription(row.get("description").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}			
			
			try {
				project.setKeywords(row.get("keywords").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setHomepage_url(row.get("homepage_url").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setLicenses(row.get("licenses").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setRepository_url(row.get("repository_url").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setSourcerank(Integer.valueOf(row.get("sourcerank").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setVersions_count(Integer.valueOf(row.get("versions_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setLatest_release_publish_timestamp(new Timestamp(row.get("latest_release_publish_timestamp").getTimestampValue()/1000));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setLatest_release_number(row.get("latest_release_number").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setDependent_projects_count(Integer.valueOf(row.get("dependent_projects_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}			
			
			try {
				project.setDependent_repositories_count(Integer.valueOf(row.get("dependent_repositories_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setLanguage(row.get("language").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setStatus(row.get("status").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setRepository_host_type(row.get("repository_host_type").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setRepository_name_with_owner(row.get("repository_name_with_owner").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				project.setRepository_description(row.get("repository_description").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_fork(row.get("repository_fork").getBooleanValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_created_timestamp(new Timestamp(row.get("repository_created_timestamp").getTimestampValue()/1000));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_updated_timestamp(new Timestamp(row.get("repository_updated_timestamp").getTimestampValue()/1000));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_last_pushed_timestamp(new Timestamp(row.get("repository_last_pushed_timestamp").getTimestampValue()/1000));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_homepage_url(row.get("repository_homepage_url").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_size(Integer.valueOf(row.get("repository_size").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_stars_count(Integer.valueOf(row.get("repository_stars_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_language(row.get("repository_language").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_issues_enabled(row.get("repository_issues_enabled").getBooleanValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_wiki_enabled(row.get("repository_wiki_enabled").getBooleanValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_pages_enabled(row.get("repository_pages_enabled").getBooleanValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_forks_count(Integer.valueOf(row.get("repository_forks_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_mirror_url(row.get("repository_mirror_url").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_open_issues_count(Integer.valueOf(row.get("repository_open_issues_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_default_branch(row.get("repository_default_branch").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_watchers_count(Integer.valueOf(row.get("repository_watchers_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_uuid(row.get("repository_uuid").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_fork_source_name_with_owner(row.get("repository_fork_source_name_with_owner").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_license(row.get("repository_license").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_contributors_count(Integer.valueOf(row.get("repository_contributors_count").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_readme_filename(row.get("repository_readme_filename").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_changelog_filename(row.get("repository_changelog_filename").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_contributing_guidelines_filename(row.get("repository_contributing_guidelines_filename").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_license_filename(row.get("repository_license_filename").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_code_of_conduct_filename(row.get("repository_code_of_conduct_filename").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_security_threat_model_filename(row.get("repository_security_threat_model_filename").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_security_audit_filename(row.get("repository_security_audit_filename").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_status(row.get("repository_status").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_sourcerank(Integer.valueOf(row.get("repository_sourcerank").getStringValue()));
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_display_name(row.get("repository_display_name").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_scm_type(row.get("repository_scm_type").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_pull_requests_enabled(row.get("repository_pull_requests_enabled").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_logo_url(row.get("repository_logo_url").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setRepository_keywords(row.get("repository_keywords").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			try {
				project.setBh(row.get("repository_keywords").getStringValue());
			} catch (Exception e) {
				// TODO: handle exception
			}

			listProjects.add(project);
		}
		
		projectRepository.saveAll(listProjects);
		System.out.println("listProjects:"+listProjects.size());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.currentThread().stop();
	}
}