# .PHONY: build
# build:
# 	@echo "Building files..."
# 	@mvn build

.PHONY: test
test:
	@arg="$$(echo $(MAKECMDGOALS) | cut -d' ' -f2)"; \
	if [ "$$arg" != "test" ]; then \
		echo "Running test: $$arg"; \
		mvn test -Dtest=$$arg; \
	else \
		echo "Running tests..."; \
		mvn test; \
	fi
