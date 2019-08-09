package com.fcs.services;

import java.io.IOException;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.fcs.models.Project;
import com.fcs.repositories.ProjectRepository;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.FieldValueList;
import com.google.cloud.bigquery.Job;
import com.google.cloud.bigquery.JobId;
import com.google.cloud.bigquery.JobInfo;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.TableResult;

public class CrawlBigQuery {
	private ProjectRepository projectRepository;

	public static void main(String[] args) throws IOException, InterruptedException {
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		/*
		BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
		QueryJobConfiguration queryConfig = QueryJobConfiguration
				.newBuilder(
						"SELECT * FROM `bigquery-public-data.libraries_io.projects` ORDER BY id LIMIT 5000 OFFSET 0")
				// Use standard SQL syntax for queries.
				// See: https://cloud.google.com/bigquery/sql-reference/
				.setUseLegacySql(false).build();

		// Create a job ID so that we can safely retry.
		JobId jobId = JobId.of(UUID.randomUUID().toString());
		Job queryJob = bigquery.create(JobInfo.newBuilder(queryConfig).setJobId(jobId).build());

		// Wait for the query to complete.
		queryJob = queryJob.waitFor();

		// Check for errors
		if (queryJob == null) {
			throw new RuntimeException("Job no longer exists");
		} else if (queryJob.getStatus().getError() != null) {
			// You can also look at queryJob.getStatus().getExecutionErrors() for all
			// errors, not just the latest one.
			throw new RuntimeException(queryJob.getStatus().getError().toString());
		}

		// Get the results.
		TableResult result = queryJob.getQueryResults();
		// Print all pages of the results.
		for (FieldValueList row : result.iterateAll()) {
			// String url = row.get("url").getStringValue();
			// long viewCount = row.get("view_count").getLongValue();
			Project project = new Project();
			System.out.println(row.get("id").getStringValue() + "|" + row.get("name").getStringValue());
		}
		*/
	    jdbcTemplate.update("INSERT INTO user_info (name, address) VALUES ('Songuku', 'Japanese')");
	}
}
