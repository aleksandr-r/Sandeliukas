FROM airhacks/glassfish
COPY ./target/one.war ${DEPLOYMENT_DIR}
