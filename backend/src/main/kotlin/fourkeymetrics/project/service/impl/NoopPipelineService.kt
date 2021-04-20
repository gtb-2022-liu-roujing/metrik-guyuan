package fourkeymetrics.project.service.impl

import fourkeymetrics.common.model.Build
import fourkeymetrics.common.model.Status
import fourkeymetrics.project.model.Pipeline
import fourkeymetrics.project.service.PipelineService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service("noopPipelineService")
class NoopPipelineService : PipelineService() {
    private var logger = LoggerFactory.getLogger(this.javaClass.name)

    override fun syncBuilds(pipelineId: String): List<Build> {
        logger.info("Noop implementation")
        return emptyList()
    }

    override fun verifyPipelineConfiguration(pipeline: Pipeline) {
        logger.info("Noop implementation")
    }

    override fun mapStageStatus(statusInPipeline: String?): Status {
        logger.info("Noop implementation")
        return Status.OTHER
    }

    override fun mapBuildStatus(statusInPipeline: String?): Status {
        logger.info("Noop implementation")
        return Status.OTHER
    }
}