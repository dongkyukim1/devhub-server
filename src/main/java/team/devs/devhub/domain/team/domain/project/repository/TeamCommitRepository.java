package team.devs.devhub.domain.team.domain.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.devs.devhub.domain.team.domain.project.TeamCommit;

public interface TeamCommitRepository extends JpaRepository<TeamCommit, Long> {
}
